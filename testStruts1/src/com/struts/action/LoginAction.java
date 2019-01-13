package com.struts.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action{

	
	public String execute() throws Exception {
		//取得页面提交的用户名和密码
		HttpServletRequest request= ServletActionContext.getRequest();
		
		String loginname=request.getParameter("loginname");
		String pwd=request.getParameter("pwd");
		if(loginname !=null&&!"".equals(loginname)&&pwd!=null&&!"".equals(pwd)){
			
			if(loginname.equals("zhangsan") && pwd.equals("123")){
				request.setAttribute("name", loginname);
				return Action.SUCCESS;
			}else return Action.ERROR;
			
		}
		
		
		
		
		return Action.NONE;
	}

}
