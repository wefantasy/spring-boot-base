package com.ctgu.qmx.springbootbase.service.impl;

import com.ctgu.qmx.springbootbase.entity.User;
import com.ctgu.qmx.springbootbase.mapper.UserMapper;
import com.ctgu.qmx.springbootbase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectList(null);
    }

    @Override
    public User selectUserById(User user) {
        return userMapper.mySelectUserById(user);
    }


}
