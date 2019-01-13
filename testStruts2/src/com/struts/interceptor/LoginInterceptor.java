package com.struts.interceptor;

import java.util.Map;

import javax.persistence.Parameter;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor{


	public String intercept(ActionInvocation invocation) throws Exception {
		//����������ȡsession�Ͳ�������
		ActionContext context = invocation.getInvocationContext();
		//����session����
		Map session = context.getSession();
		//���ؿͻ����ύ�����в���
		//Map parameters =context.getParameters();
		//String uname = Parameters.get("uname").toString();
		if(session.get("uname")!=null){
			return invocation.invoke();
		}
		return Action.ERROR;
	}

}
