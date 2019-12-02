package com.example.demo.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")//映射路径
public class Controller {
	@Autowired
    private UserService userService;
	
	
	@RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<User> getAllUser(){
		
		return userService.getAllUser();
        
    }


	@RequestMapping(value = "/login",method = RequestMethod.POST)//@Requestparam作用是为获取前端参数
	 public Map <String,Object> login(String username,String password){
		  Map<String,Object> map = new HashMap<String,Object>();
		  User u1 =userService.login(username,password);        
		  if (u1==null){            
			 map.put("success",0);
			 map.put("errMsg","用户名或密码错误");
			  }else{            
			 map.put("success",1);
			 map.put("errMsg","");
			  }
		  return map;
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

