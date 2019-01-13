package com.struts.util;

import java.util.Iterator;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class MyDemo3 extends AbstractInterceptor{


	public String intercept(ActionInvocation actionInvocation) throws Exception {
		System.out.println("execute interceptor2");

		ActionContext context = actionInvocation.getInvocationContext();
		// 返回session对象
		Map session = context.getSession();
		// 返回所有参数集合
		Map parameters = context.getParameters();
		Object uname =  parameters.get("uname");
		Object pwd = parameters.get("pwd");
		
		for (Iterator iterator = parameters.values().iterator(); iterator.hasNext();) {
			Object name = (Object) iterator.next();
			System.out.println(name.toString());
		}
		//值栈
		ValueStack vStack = context.getValueStack();
		
		
		// 对参数格式进行验证.
//		System.out.println(uname.toString() + " - " + pwd.toString());

		return actionInvocation.invoke();
	}

}
