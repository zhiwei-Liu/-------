package com.struts.util;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MyDemo4 extends MethodFilterInterceptor{

	
	protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
		System.out.println(" execute action running ");
		return actionInvocation.invoke();
	}

}
