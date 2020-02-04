package com.ctgu.qmx.springbootbase.service;

import com.ctgu.qmx.springbootbase.entity.User;

import java.util.List;

public interface UserService {

    int insertUser(User user);
    List<User> selectAllUser();
    User selectUserById(User user);
}
