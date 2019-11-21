package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	public List<User> getAllUser(){
		
		return userMapper.selectAllUsers();
		
	}
	public User login(String username,String password) {
		return userMapper.login(username, password);
		
	}
	

}
