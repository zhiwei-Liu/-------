package com.struts.interceptor;

import java.util.Map;

import javax.persistence.Parameter;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor{


	public String intercept(ActionInvocation invocation) throws Exception {
		//在拦截器获取session和参数对象
		ActionContext context = invocation.getInvocationContext();
		//返回session对象
		Map session = context.getSession();
		//返回客户端提交的所有参数
		//Map parameters =context.getParameters();
		//String uname = Parameters.get("uname").toString();
		if(session.get("uname")!=null){
			return invocation.invoke();
		}
		return Action.ERROR;
	}

}
