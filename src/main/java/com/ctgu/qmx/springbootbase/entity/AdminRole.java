package com.ctgu.qmx.springbootbase.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminRole {
	private Integer id;	
	private Integer adminId;	
	private Integer roleId;	
}
