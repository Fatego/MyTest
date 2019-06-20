package com.dengling.demo.service;

import com.dengling.demo.entity.UserBean;

public interface IUserService {

    void addUser(UserBean userBean);

    void getUserById(String id);

    void getUserByUsername(String username);

}
