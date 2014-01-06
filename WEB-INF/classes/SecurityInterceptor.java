package com.struts2.learning;
import java.util.Map;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class SecurityInterceptor implements Interceptor{
	public void init(){
	}
	public String intercept(ActionInvocation next) throws Exception{
		Map session = next.getInvocationContext().getSession();
		User user = (User) session.get("user");
		if(user == null){
			return "login";
		}
		else{
			String s = next.invoke();
			return s;
		}
	}
	public void destroy(){
	}
}