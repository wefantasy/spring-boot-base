package com.ctgu.qmx.springbootbase.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * 自定义配置
 */
@ControllerAdvice
public class BaseAdviceContro {

	@Value("${custom.var.pwd}")
	private String pwd;
	
	@ModelAttribute(name="pwd")
	public String pwd() {
		return pwd;
	}
}
