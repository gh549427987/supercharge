package com.jhua.service.impl;

import com.jhua.service.DataService;
import com.jhua.service.RoleService;
import com.jhua.service.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author xiejiehua
 * @DATE 7/8/2021
 */

@Service
@RequiredArgsConstructor
public class DataServiceImpl implements DataService {

    private final RoleService roleService;
    private final DeptService deptService;

    @Override
    public List<Long> getDeptIds(UserDto user) {
        // 用于存储部门id
        Set<Long> roleSet = new HashSet<>();
        // 查询用户角色


        return null;
    }
}
