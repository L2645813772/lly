package com.example.demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserMapper {
	

	

	User Sel(int id);

	public  User login(@Param("username")String username, @Param("password")String password);
	
 }


