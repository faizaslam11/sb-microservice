/**
 * 
 */
package com.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.entity.User;

import com.userservice.service.UserServiceImp;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserServiceImp userService;
	
	@PostMapping("/registeruser")
	@CrossOrigin("http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempUserName = user.getUserName();
		if(tempUserName != null && !"".equals(tempUserName)) {
			User userObj = userService.fetchUserByUserName(tempUserName);
			if(userObj != null) {
				throw new Exception("User with "+tempUserName+"already exist!");
			}
		}
		User userObj = null;
		userObj = userService.saveUser(user);
		return userObj;
	}
	@PostMapping("/login")
	@CrossOrigin("http://localhost:4200")
      public User loginUser(@RequestBody User user) throws Exception {
		String tempUserName = user.getUserName();
		String tempPassword = user.getPassword();
		User userObj = null;
		if(tempUserName != null && tempPassword!=null) {
			userObj = userService.fetchUserByUserNameAndPassword(tempUserName, tempPassword);
		}
		if(userObj == null) {
			throw new Exception("Bad Credentials!");
		}
		return userObj;
	}
}
