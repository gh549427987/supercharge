package com.jhua.service.impl;

import com.jhua.dao.UserMapper;
import com.jhua.model.User;
import com.jhua.service.UserService;
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
}
