package com.jhua.controller;

import cn.hutool.core.util.IdUtil;
import com.jhua.common.annotation.rest.AnonymousGetMapping;
import com.jhua.common.annotation.rest.AnonymousPostMapping;
import com.jhua.common.config.RsaProperties;
import com.jhua.common.exception.BadRequestException;
import com.jhua.common.utils.RedisUtils;
import com.jhua.common.utils.RsaUtils;
import com.jhua.common.utils.StringUtils;
import com.jhua.security.TokenProvider;
import com.jhua.security.config.bean.LoginCodeEnum;
import com.jhua.security.config.bean.LoginProperties;
import com.jhua.security.config.bean.SecurityProperties;
import com.jhua.security.dto.AuthUserDto;
import com.jhua.security.dto.JwtUserDto;
import com.jhua.security.service.OnlineUserService;
import com.wf.captcha.base.Captcha;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author xiejiehua
 * @DATE 7/5/2021
 */

@Slf4j
@RestController
@RequiredArgsConstructor
// @RequiredArgsConstructor
// 印象笔记有记录，回去理解一下
@RequestMapping("/user")
@Tag(name = "用户：用户授权接口")
public class UserController {

    private final SecurityProperties properties;
    private final RedisUtils redisUtils;
    private final TokenProvider tokenProvider;
    private final OnlineUserService onlineUserService;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;


    @Resource
    private LoginProperties loginProperties;

    @Operation(summary = "登录功能")
    @AnonymousPostMapping(value = "/login")
    public ResponseEntity<Object> login(@Validated @RequestBody AuthUserDto authUserDto, HttpServletRequest request) throws Exception {
        // 关于@validated的使用说明
        // https://blog.csdn.net/herojuice/article/details/86020101

        // 密码解密
        String password = RsaUtils.decryptByPrivateKey(RsaProperties.privateKey, authUserDto.getPassword());

        // 查询验证码
        String code = (String) redisUtils.get(authUserDto.getUuid());

        // 清除验证码
        redisUtils.del(authUserDto.getUuid());
        if (StringUtils.isBlank(code)) {
            throw new BadRequestException("验证码不存在或已经过期了");
        }
        if (StringUtils.isBlank(authUserDto.getCode()) || !authUserDto.getCode().equalsIgnoreCase(code)) {
            throw new BadRequestException("验证码错误!");
        }
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(authUserDto.getUsername(), password);
        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(usernamePasswordAuthenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = tokenProvider.createToken(authentication);
        final JwtUserDto jwtUserDto = (JwtUserDto) authentication.getPrincipal();

        // 保存在线信息
        onlineUserService.save(jwtUserDto, token, request);

        // 返回token与用户信息
        HashMap<String, Object> authInfo = new HashMap<String, Object>(2) {{
            put("token", properties.getTokenStartWith() + token);
            put("user", jwtUserDto);
        }};
        if (loginProperties.isSingleLogin()) {
            // 踢掉之前的已经登录的token
            onlineUserService.checkLoginOnUser(authUserDto.getUsername(), token);
        }

        return ResponseEntity.ok(authInfo);
    }

//    @GetMapping("/

    @Operation(summary = "获取验证码")
    @AnonymousGetMapping(value = "/code")
    public ResponseEntity<Object> getCode() {

        // 获取运算结果
        Captcha captcha = loginProperties.getCaptcha();
        String uuid = properties.getCodeKey() + IdUtil.simpleUUID();

        System.out.println(captcha.toString());

        //当验证码类型为 arithmetic时且长度 >= 2 时，captcha.text()的结果有几率为浮点型
        String captchaValue = captcha.text();
        if (captcha.getCharType() - 1 == LoginCodeEnum.arithmetic.ordinal() && captchaValue.contains(".")) {
            captchaValue = captchaValue.split("\\.")[0];
        }

        // 保存
        redisUtils.set(uuid, captchaValue, loginProperties.getLoginCode().getExpiration(), TimeUnit.MINUTES);

        // 验证码信息
        Map<String, Object> imgResult = new HashMap<String, Object>(2) {{
            put("img", captcha.toBase64());
            put("uuid", uuid);
        }};

        System.out.println(imgResult);
        return ResponseEntity.ok(imgResult);


    }

}
