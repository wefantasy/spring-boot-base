package com.ctgu.qmx.springbootbase.controller;

import com.ctgu.qmx.springbootbase.entity.User;
import com.ctgu.qmx.springbootbase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserContro {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(){return "login";}

    @ResponseBody
    @RequestMapping("/loginInfo")
    public User loginInfo(User user){
        System.out.println(user);
        return user;
    }

    @ResponseBody
    @RequestMapping("/getAll")
    public List<User> getAll(){
        return userService.selectAllUser();
    }

    @ResponseBody
    @RequestMapping("/getUserById")
    public User getUserById(){
        User user = new User();
        user.setId(1);
        return userService.selectUserById(user);
    }
}
