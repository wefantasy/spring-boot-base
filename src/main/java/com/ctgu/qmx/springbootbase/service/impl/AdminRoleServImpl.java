package com.ctgu.qmx.springbootbase.service.impl;

import com.ctgu.qmx.springbootbase.entity.AdminRole;
import com.ctgu.qmx.springbootbase.mapper.AdminRoleMapper;
import com.ctgu.qmx.springbootbase.service.AdminRoleServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminRoleServ")
public class AdminRoleServImpl implements AdminRoleServ {

	@Autowired
	private AdminRoleMapper adminRoleMapper;

	@Override
	public boolean doAdd(AdminRole o) {
		if (adminRoleMapper.insert(o) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doDel(AdminRole o) {
		if (adminRoleMapper.deleteById(o.getId()) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doUpd(AdminRole o) {
		if (adminRoleMapper.updateById(o) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<AdminRole> doSel(AdminRole o) {
		return adminRoleMapper.doSelectBySome(o);
	}

}
