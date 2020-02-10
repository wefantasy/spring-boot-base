package com.ctgu.qmx.springbootbase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctgu.qmx.springbootbase.mapper.UserMapper;
import com.ctgu.qmx.springbootbase.entity.User;
import com.ctgu.qmx.springbootbase.service.UserServ;

@Service("UserServ")
public class UserServImpl implements UserServ {

	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean doAdd(User o) {
		if (userMapper.insert(o) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doDel(User o) {
		if (userMapper.deleteById(o.getId()) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doUpd(User o) {
		if (userMapper.updateById(o) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<User> doSel(User o) {
		return userMapper.doSelectBySome(o);
	}

}
