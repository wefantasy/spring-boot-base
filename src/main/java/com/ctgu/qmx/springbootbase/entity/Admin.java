package com.ctgu.qmx.springbootbase.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin implements UserDetails {
	private Integer id;	
	private String username;	
	private String password;	
	private String icon;	//头像
	private String city;	//所在城市
	private String nickName;	//昵称
	private String note;	//备注
	private Integer contactInfoId;	//联系方式id
	private Integer status;	//帐号启用状态：0->禁用；1->启用
	private Timestamp lastLoginTime;	//最后登陆时间
	private Timestamp createTime;	//创建时间

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		String[] authorities = "super_admin,common_admin".split(",");
		List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
		for (String role : authorities) {
			simpleGrantedAuthorities.add(new SimpleGrantedAuthority(role));
		}
		return simpleGrantedAuthorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
