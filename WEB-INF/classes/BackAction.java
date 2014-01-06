package com.struts2.learning;

import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

public class BackAction extends ActionSupport implements SessionAware{
	Map session;
	public void setSession(Map session){
		this.session = session;
	}
	public String execute(){
		User user = (User) session.get("user");
		if(user == null)
			return "guest";
		else
			return "user";
	}
}