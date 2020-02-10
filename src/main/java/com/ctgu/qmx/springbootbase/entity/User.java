package com.ctgu.qmx.springbootbase.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Integer id;	
	private String username;	
	private String password;	
	private String nickName;	
	private String name;	
	private String sex;	
	private Integer age;	
	private Integer school;	
	private String studentid;	
	private String summary;	
	private Timestamp datetime;
	private Integer status;	
}
