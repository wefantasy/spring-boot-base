package com.ctgu.qmx.springbootbase.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ctgu.qmx.springbootbase.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends BaseMapper<User> {

    User mySelectUserById(User user);
}