package com.struts.action;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action{
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
		System.out.println(uname);
		System.out.println("execute Action *********");
		return "success";
	}

}
