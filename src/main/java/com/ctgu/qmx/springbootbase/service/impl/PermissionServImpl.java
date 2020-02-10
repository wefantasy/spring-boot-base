package com.ctgu.qmx.springbootbase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctgu.qmx.springbootbase.mapper.PermissionMapper;
import com.ctgu.qmx.springbootbase.entity.Permission;
import com.ctgu.qmx.springbootbase.service.PermissionServ;

@Service("PermissionServ")
public class PermissionServImpl implements PermissionServ {

	@Autowired
	private PermissionMapper permissionMapper;

	@Override
	public boolean doAdd(Permission o) {
		if (permissionMapper.insert(o) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doDel(Permission o) {
		if (permissionMapper.deleteById(o.getId()) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doUpd(Permission o) {
		if (permissionMapper.updateById(o) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<Permission> doSel(Permission o) {
		return permissionMapper.doSelectBySome(o);
	}

}
