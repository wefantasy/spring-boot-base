package com.ctgu.qmx.springbootbase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctgu.qmx.springbootbase.mapper.RolePermissionMapper;
import com.ctgu.qmx.springbootbase.entity.RolePermission;
import com.ctgu.qmx.springbootbase.service.RolePermissionServ;

@Service("RolePermissionServ")
public class RolePermissionServImpl implements RolePermissionServ {

	@Autowired
	private RolePermissionMapper rolePermissionMapper;

	@Override
	public boolean doAdd(RolePermission o) {
		if (rolePermissionMapper.insert(o) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doDel(RolePermission o) {
		if (rolePermissionMapper.deleteById(o.getId()) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doUpd(RolePermission o) {
		if (rolePermissionMapper.updateById(o) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<RolePermission> doSel(RolePermission o) {
		return rolePermissionMapper.doSelectBySome(o);
	}

}
