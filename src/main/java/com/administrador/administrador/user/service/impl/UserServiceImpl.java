package com.administrador.administrador.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administrador.administrador.user.User;
import com.administrador.administrador.user.repository.UserRepository;
import com.administrador.administrador.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void saveUser(User user) throws Exception {
		validatePassword(user.getPassword());
		userRepository.save(user);
		
	}

	@Override
	public void changePassword(Integer userId, String newPassword) throws Exception {
		validatePassword(newPassword);
		userRepository.changePassword(userId, newPassword);
		
	}

	private void validatePassword(String newPassword) throws Exception {
		if(newPassword.matches("[+-]?\\d*(\\.\\d+)?") && newPassword.length() == 4) {
			return;
		}else {
			throw new Exception();
		}
		
	}

	@Override
	public void deleteUserId(Integer userId) {
		userRepository.delete(userId);
		
	}

	@Override
	public List<User> showUser() {
		return userRepository.showAllUsers();
	}

}
