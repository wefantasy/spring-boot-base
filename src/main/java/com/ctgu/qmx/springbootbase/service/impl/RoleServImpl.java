package com.ctgu.qmx.springbootbase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctgu.qmx.springbootbase.mapper.RoleMapper;
import com.ctgu.qmx.springbootbase.entity.Role;
import com.ctgu.qmx.springbootbase.service.RoleServ;

@Service("RoleServ")
public class RoleServImpl implements RoleServ {

	@Autowired
	private RoleMapper roleMapper;

	@Override
	public boolean doAdd(Role o) {
		if (roleMapper.insert(o) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doDel(Role o) {
		if (roleMapper.deleteById(o.getId()) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doUpd(Role o) {
		if (roleMapper.updateById(o) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<Role> doSel(Role o) {
		return roleMapper.doSelectBySome(o);
	}

}
