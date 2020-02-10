package com.ctgu.qmx.springbootbase.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminPermission {
	private Integer id;	
	private Integer adminId;	
	private Integer permissionId;	
}
