package com.struts2.learning;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class LoginAction extends ActionSupport implements ModelDriven<User>, Preparable, SessionAware{
	User user;
	Map session;
	public void setUser(User user){
		this.user = user;
	}
	public User getUser(){
		return user;
	}
	public String authenticate(){
		if(user.getUsername().equals("Hrishikesh@yahoo.com") && user.getPassword().equals("123456")){
			session.put("user",user);
			return SUCCESS;
		}
		else{
			
//			user.setUsername(""); //calling this to setusername blank after invalid login
			addActionError(getText("app.incorrect.user.pass"));
			return "input";
		}
	}
	//to put the user object in value stack
	public User getModel(){
		return user;
	}
	//Incase if we forget to give "new" User()
	public void prepare(){
		user = new User();
	}
	public void setSession(Map session){
		this.session = session;
	}
/*
	public void validate(){
		if((user.getUsername() == null) || (user.getUsername().equals(""))){
			addFieldError("username", "Username is required"); //username should be same as in jsp egs user.username should be user.username
		}
		if((user.getPassword() == null) || (user.getPassword().equals(""))){
			addFieldError("password", "Password is required"); //passowrd should be same as in jsp egs user.password should be user.username
		}
	}
*/
}
//ModelDriven interface is generic