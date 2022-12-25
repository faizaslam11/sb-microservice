

package com.userservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.userservice.entity.User;
import com.userservice.repository.UserRepository;
@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User fetchUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(userName);
	}

	@Override
	public User fetchUserByUserNameAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return userRepository.findByUserNameAndPassword(userName, password);
	}

}
