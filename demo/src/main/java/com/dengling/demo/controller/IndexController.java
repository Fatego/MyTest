package com.dengling.demo.controller;

import com.dengling.demo.entity.UserBean;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "thymeleaf")
public class IndexController {
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(Model model){
        UserBean user = new UserBean();
        user.setName("张三");
        user.setAge(22);

        List<UserBean> users = new ArrayList<>();
        UserBean u1=new UserBean();
        u1.setName("李四");
        u1.setAge(23);
        users.add(u1);

        UserBean u2=new UserBean();
        u2.setName("王五");
        u2.setAge(24);
        users.add(u2);

        UserBean u3=new UserBean();
        u3.setName("赵六");
        u3.setAge(25);
        users.add(u3);

        model.addAttribute("users",users);
        model.addAttribute("user",user);

        return "index";
    }
}
