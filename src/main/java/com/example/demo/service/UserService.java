package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	public User Sel(int id) {
		return userMapper.Sel(id);
	}
	public User login(String username, String password) {
		return userMapper.login(username,password);
	}
	

}
