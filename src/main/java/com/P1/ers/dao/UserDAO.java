package com.P1.ers.dao;

import java.util.List;

import com.P1.ers.model.User;


public interface UserDAO {

	public boolean register(User user);
	public User validate(String username, String password);

	public List<User> getUserInfo();
	public List<User> getUserInfoByUsername (String username);
	public List<User> getUserByUserName(String username);
	public boolean updateUser(User user);
	
	
	
	




}
