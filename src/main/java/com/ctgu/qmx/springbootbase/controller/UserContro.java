package com.ctgu.qmx.springbootbase.controller;

import com.ctgu.qmx.springbootbase.entity.User;
import com.ctgu.qmx.springbootbase.service.UserServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//@Controller
//@RequestMapping("/user")
public class UserContro {

    @Autowired
    private UserServ userServ;

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
        return userServ.doSel(new User());
    }

    @ResponseBody
    @RequestMapping("/getUserById")
    public User getUserById(){
        User user = new User();
        user.setId(1);
        return userServ.doSel(user).get(0);
    }
}
