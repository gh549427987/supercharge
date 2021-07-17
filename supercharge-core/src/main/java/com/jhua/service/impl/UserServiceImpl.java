package com.jhua.service.impl;

import com.jhua.common.base.BaseMapper;
import com.jhua.common.exception.EntityNotFoundException;
import com.jhua.dao.UserMapper;
import com.jhua.model.User;
import com.jhua.service.UserService;
import com.jhua.service.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiejiehua
 * @DATE 7/5/2021
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String create(User user) throws Exception {

        return null;
    }

    @Override
    public User findByName(String userName) {
        User userDto = userMapper.selectByUsername(userName);
        System.out.println(userDto.toString());
        if (userDto == null) {
            throw new EntityNotFoundException(User.class, "name", userName);
        } else {
            return userDto;
        }
    }

    @Override
    public UserDto findDtoByName(String userName) {
        UserDto userDto = userMapper.selectDtoByUsername(userName);
        System.out.println(userDto.toString());
        if (userDto == null) {
            throw new EntityNotFoundException(User.class, "name", userName);
        } else {
            return userDto;
        }
    }
}
