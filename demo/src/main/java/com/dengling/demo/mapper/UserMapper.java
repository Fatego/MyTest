package com.dengling.demo.mapper;

import com.dengling.demo.entity.UserBean;
import org.apache.ibatis.annotations.*;
public interface UserMapper {
    @Insert("insert into user values(#{id},#{username},#{password},#{token},#{email},#{sex},#{age},#{phone},#{reg_time},#{last_login_time}")
    void addUser(UserBean userBean);
    @Select("select * from user where id=#{id}")
    void getUserById(String id);
    @Select("select * from user where username=#{username}")
    void getUserByUsername(String username);
}
