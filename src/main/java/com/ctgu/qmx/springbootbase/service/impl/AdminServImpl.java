package com.ctgu.qmx.springbootbase.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.ctgu.qmx.springbootbase.entity.Admin;
import com.ctgu.qmx.springbootbase.mapper.AdminMapper;
import com.ctgu.qmx.springbootbase.service.AdminServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("adminServ")
public class AdminServImpl implements UserDetailsService, AdminServ {

	@Autowired
	private AdminMapper adminMapper;

	@Override
	public boolean doAdd(Admin o) {
		if (adminMapper.insert(o) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doDel(Admin o) {
		if (adminMapper.deleteById(o.getId()) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean doUpd(Admin o) {
		if (adminMapper.updateById(o) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<Admin> doSel(Admin o) {
		return adminMapper.doSelectBySome(o);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Admin admint = new Admin();
		admint.setUsername(username);
		List<Admin> admins = adminMapper.doSelectBySome(admint);
		if(CollectionUtil.isEmpty(admins)){
			throw new UsernameNotFoundException("数据库中无此用户！");
		}
		Admin admin = admins.get(0);
		String[] authorities = "super_admin,common_admin".split(",");
		List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
		for (String role : authorities) {
			simpleGrantedAuthorities.add(new SimpleGrantedAuthority(role));
		}

		return admin;
	}
}
