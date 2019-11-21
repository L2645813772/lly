package com.example.demo.mapper;


import java.util.List;



import com.example.demo.entity.User;





public interface UserMapper {
	
	public List<User> selectAllUsers();
	
	public User login(String username,String password);



	

	

	

	
	
 }


