package com.ctgu.qmx.springbootbase.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
	private Integer id;	
	private String code;	//角色代码
	private String description;	//描述
	private Integer status;	//启用状态：0->禁用；1->启用
	private Integer sort;	//权重
	private Timestamp createTime;	//创建时间
}
