package com.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action{

	private String uname;//��ҳ���������һ��
	private String pwd;
	
	
	
	
	public String getUname() {
		return uname;
	}




	public void setUname(String uname) {
		this.uname = uname;
	}




	public String getPwd() {
		return pwd;
	}




	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



//��������
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		
		if(uname !=null&&!"".equals(uname)&&pwd!=null&&!"".equals(pwd)){
			if(uname.equals("admin")&&pwd.equals("123")){
				session.setAttribute("uname", uname);
				return "success";
			}else
				return Action.ERROR;
		}
		
		
		return Action.INPUT;
	}

}
