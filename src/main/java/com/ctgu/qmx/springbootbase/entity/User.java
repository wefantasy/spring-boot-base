package com.ctgu.qmx.springbootbase.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Title: User.java
 *
 *
 * @Description: TODO
 *
 * @author Fantasy
 *
 * @date 2018年6月3日
 *
 * @version V1.0
 */
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
	private String datetime;
	private Integer status;

}
