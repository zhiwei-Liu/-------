package com.struts.util;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterDemo extends AbstractInterceptor{


	public String intercept(ActionInvocation actionInvocation) throws Exception {
		
		ActionContext context = actionInvocation.getInvocationContext();
		//∑µªÿsession∂‘œÛ
		Map session = context.getSession();
		if(session !=null){
			if(session.get("uname")!= null) {
				return actionInvocation.invoke();
			}
			
			
			
		}
			
		return Action.ERROR;
	}

}
