package com.ctgu.qmx.springbootbase.aop;

import com.ctgu.qmx.springbootbase.entity.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


/**  
*
* @Description: aop test
*
* @author Fantasy  
*
* @date 2019年4月14日  
*
* @version V1.0
*/
@Aspect
@Component
public class UserPermissions {
	@Pointcut("execution(public * com.ctgu.qmx.springbootbase.controller.UserContro.*(..))")
	public void permissionPointcut() {
	}
	
	@Around("permissionPointcut()")
	public Object permissionPointcutBefore(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("this is UserContro aop");
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		User user =  (User) request.getSession().getAttribute("user");
		//未登录
		if( user == null ){
			//重定向到登陆界面
			//HttpServletResponse response = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getResponse();
			//String path = request.getServletContext().getContextPath() + "/login";
			//response.sendRedirect(path);

			System.out.println("未登录");
			//return null;
		}
		return pjp.proceed();
	}
}
