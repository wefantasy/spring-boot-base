package com.ctgu.qmx.springbootbase.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Permission {
	private Integer id;	
	private Integer pid;	//父级权限id
	private String name;	//名称
	private String value;	//权限值
	private String icon;	//图标
	private Integer type;	//权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
	private String uri;	//前端资源路径
	private Integer sort;	//权重
	private Integer status;	//启用状态：0->禁用；1->启用
	private Timestamp createTime;	//创建时间
}
