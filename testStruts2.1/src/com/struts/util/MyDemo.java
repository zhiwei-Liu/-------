package com.struts.util;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyDemo implements Interceptor{

	public void destroy() {
		
		
	}


	public void init() {
		
		
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		
		System.out.println("execute intercetor *******");
		//����ִ������������
		return invocation.invoke();
	}

}
