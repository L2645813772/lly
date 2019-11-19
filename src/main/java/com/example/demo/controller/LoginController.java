package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController {
	@Autowired
    private UserService userService;
	//跳转首页（登录页）
	@RequestMapping("/")
	 	public String show(){

	        return "login";

	    }
	//@ResponseBody    
	@RequestMapping("/login")    
	public String login(User user, HttpServletRequest request){        
		String username = user.getUsername();        
		String password = user.getPassword();        
		User u =userService.login(username,password); 
		
		if (u!=null){
			request.getSession().setAttribute("session_user",user); //登录成功后将用户放入session中，用于拦截            
			return "welcome";        
		}else{            
			        
			return "login";
		}
		
		  
	}
	
	 @RequestMapping("/welcome")

	 public String welcome(){

		 return "welcome";
 
    }
}

