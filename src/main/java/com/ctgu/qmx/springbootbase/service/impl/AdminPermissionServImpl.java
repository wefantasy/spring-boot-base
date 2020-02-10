package com.ctgu.qmx.springbootbase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctgu.qmx.springbootbase.mapper.AdminPermissionMapper;
import com.ctgu.qmx.springbootbase.entity.AdminPermission;
import com.ctgu.qmx.springbootbase.service.AdminPermissionServ;

@Service("AdminPermissionServ")
public class AdminPermissionServImpl implements AdminPermissionServ {

	@Autowired
	private AdminPermissionMapper adminPermissionMapper;

	@Override
	public boolean doAdd(AdminPermission o) {
		if (adminPermissionMapper.insert(o) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doDel(AdminPermission o) {
		if (adminPermissionMapper.deleteById(o.getId()) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doUpd(AdminPermission o) {
		if (adminPermissionMapper.updateById(o) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<AdminPermission> doSel(AdminPermission o) {
		return adminPermissionMapper.doSelectBySome(o);
	}

}
