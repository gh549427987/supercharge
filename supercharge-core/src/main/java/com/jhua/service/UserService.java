package com.jhua.service;

import com.jhua.model.User;
import com.jhua.service.dto.UserDto;

import java.util.List;
import java.util.Set;

public interface UserService {

    /*
     * @Description //TODO 创建用户
     * @Date 9:21 PM 7/5/2021
     * @return
     * @throws
     **/
    String create(User user) throws Exception;

    /*
     * @Author xiejiehua
     * @Description //TODO 通过username找到用户dto
     * @Date 11:01 AM 7/7/2021
     * @Param [userName]
     * @return com.jhua.service.dto.UserDto
     **/
    UserDto findByName(String userName);
}

