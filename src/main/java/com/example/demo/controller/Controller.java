package com.example.demo.controller;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class Controller {
	@Autowired
    private UserService userService;
	
	
	@RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<User> getAllUser(){
		
		return userService.getAllUser();
        
    }


	@RequestMapping(value = "/login",method = RequestMethod.POST)
	 public String login(@RequestParam(value="username",required = false) String username, @RequestParam(value="password",required = false) String password) {
		  User u1 =userService.login(username,password);        
		  if (u1==null){            
			  return "用户名或密码错误";        
			  }else{            
			  return "登录成功";
			  }
		  }
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	 public Object register(User user) {
		if(userService.findByName(user.getUsername()) != null) {
			JSONObject jsonObject = new JSONObject();
            jsonObject.put("message","用户名已被使用");
            return jsonObject;
		}
		return userService.register(user);
	}
		  

	
	
}

