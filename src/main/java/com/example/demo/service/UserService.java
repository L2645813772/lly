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
	public List<User> findById(Integer id) {
		User param = new User();
		param.setId(id);
		return userMapper.findOne(param);
		
	}
	
	public User Sel(int id){

        return userMapper.Sel(id);

    }
	

	public Object updateUser(User user) {
		return userMapper.updateUser(user);
	}
	
	public Object updateUsername(User user) {
		return userMapper.updateUsername(user);
	}
	
	public Object updategender(User user) {
		return userMapper.updategender(user);
	}
	
	public Object updatebirth(User user) {
		return userMapper.updatebirth(user);
	}
	
	public Object updateyours(User user) {
		return userMapper.updateyours(user);
	}
	
	public Object delectUser(User user) {
		return userMapper.deleteUser(user);
	}

}
