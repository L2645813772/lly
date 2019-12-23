package com.example.demo.controller;



import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.User;

import com.example.demo.service.UserService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")//映射路径
public class UserController {
	@Autowired
    private UserService userService;
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)//@Requestparam作用是为获取前端参数
	 public Map <String,Object> login(String username,String password){
		  Map<String,Object> map = new HashMap<String,Object>();
		  User u1 =userService.login(username,password);        
		  if (u1==null){            
			 map.put("success",0);
			 map.put("errMsg","用户名或密码错误");
			  }else{            
			 map.put("success",1);
			 map.put("errMsg","登录成功");
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
	
	
	@RequestMapping(value = "/getUser/{id}",method = RequestMethod.POST)
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }

	
	@RequestMapping(value = "/addpassword",method = RequestMethod.POST)
	public Object updateUser(User user) {
		if(userService.findById(user.getId()) != null) {
			JSONObject jsonObject = new JSONObject();
            jsonObject.put("message","修改成功");
            return jsonObject;
		}
		return userService.updateUser(user);
		
	
}
	
	@RequestMapping(value = "/infousername",method = RequestMethod.POST)
	public Object updateUsername(User user) {
		if(userService.findById(user.getId()) != null) {
			JSONObject jsonObject = new JSONObject();
            jsonObject.put("message","修改成功");
            return jsonObject;
		}
		return userService.updateUsername(user);
		
	
}
	@RequestMapping(value = "/infogender",method = RequestMethod.POST)
	public Object updategender(User user) {
		if(userService.findById(user.getId()) != null) {
			JSONObject jsonObject = new JSONObject();
            jsonObject.put("message","修改成功");
            return jsonObject;
		}
		return userService.updategender(user);
		
	
}
	@RequestMapping(value = "/infobirth",method = RequestMethod.POST)
	public Object updatebirth(User user) {
		if(userService.findById(user.getId()) != null) {
			JSONObject jsonObject = new JSONObject();
            jsonObject.put("message","修改成功");
            return jsonObject;
		}
		return userService.updatebirth(user);
		
	
}
	@RequestMapping(value = "/infoyours",method = RequestMethod.POST)
	public Object updateyours(User user) {
		if(userService.findById(user.getId()) != null) {
			JSONObject jsonObject = new JSONObject();
            jsonObject.put("message","修改成功");
            return jsonObject;
		}
		return userService.updateyours(user);
		
	
}
	@RequestMapping(value = "/delect",method = RequestMethod.POST)
	public Object delectUser(User user) {
		JSONObject jsonObject = new JSONObject();
		
		if (userService.findById(user.getId()) != null) {
			jsonObject.put("code",1);
			jsonObject.put("data",null);
			jsonObject.put("message","删除成功");
			return jsonObject;
		}else {
			jsonObject.put("code",0);
			jsonObject.put("data",null);
			jsonObject.put("message","删除失败");
		return jsonObject;
		
			
	}
 }
}


