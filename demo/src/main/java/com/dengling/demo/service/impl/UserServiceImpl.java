package com.dengling.demo.service.impl;

import com.dengling.demo.entity.UserBean;
import com.dengling.demo.mapper.UserMapper;
import com.dengling.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(UserBean userBean) {
        return userMapper.addUser(userBean);
    }

    @Override
    public void getUserById(String id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);

    }
}
