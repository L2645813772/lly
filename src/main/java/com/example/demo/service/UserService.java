package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service//service组件
public class UserService {
	@Autowired//自动注入
	UserMapper userMapper;
	public List<User> getAllUser(){
		
		return userMapper.selectAllUsers();
		
	}
	public User login(String username,String password) {
		return userMapper.login(username, password);
		
	}
	
	public int register(User user) {

        return userMapper.register(user);

    }
	
	public List<User> findByName(String username) {
		User param = new User();
		param.setUsername(username);
		return userMapper.findOne(param);
		
	}
}
