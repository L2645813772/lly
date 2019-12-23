package com.example.demo.mapper;


import java.util.List;



import com.example.demo.entity.User;





public interface UserMapper {
	
	
	public User login(String username,String password);
	
	int register(User user);

	public List<User> findOne(User param);

    User Sel(int id);

    Object updateUser(User user);

    Object updateUsername(User user);
    
    Object updategender(User user);
    
    Object updatebirth(User user);
    
    Object updateyours(User user);
    
    Object deleteUser(User user);
    

 }


