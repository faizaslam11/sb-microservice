package com.userservice.service;



import com.userservice.entity.User;

public interface UserService {
	
	public User saveUser(User user);
	public  User fetchUserByUserName(String userName);
	public User fetchUserByUserNameAndPassword(String userName, String password);

}
