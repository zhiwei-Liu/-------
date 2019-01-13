package com.struts.util;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyDemo2 extends AbstractInterceptor{
	private String methodname;
	private String actionname;
	public String getMethodname() {
		return methodname;
	}
	public void setMethodname(String methodname) {
		this.methodname = methodname;
	}
	public String getActionname() {
		return actionname;
	}
	public void setActionname(String actionname) {
		this.actionname = actionname;
	}
	

	public String intercept(ActionInvocation actionInvocation) throws Exception {
		System.out.println("execute interceptor2");
		System.out.println(actionname + " : " + methodname);

		ActionContext context = actionInvocation.getInvocationContext();
		//返回session对象
		Map session=context.getSession();			
		
		ActionProxy actionProxy = actionInvocation.getProxy();
		// 返回请求的action 名称
		String actionname_str = actionProxy.getActionName();
		// 返回请求的方法名
		String methodname_str = actionProxy.getMethod();
		System.err.println(actionname_str+":"+methodname_str);
		if (actionname != null && !"".equals(actionname)) {
			if (actionname.equals(actionname_str)
					&& methodname.equals(methodname_str)) {
				
				return actionInvocation.invoke();
			}

		}

		return Action.ERROR;
	}

}
