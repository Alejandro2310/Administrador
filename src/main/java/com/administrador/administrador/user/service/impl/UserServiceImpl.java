package com.administrador.administrador.user.service.impl;

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
	public void saveUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void changePassword(Integer userId, Integer newPassword) {
		userRepository.changePassword(userId, newPassword);
		
	}

	@Override
	public void deleteUserId(Integer userId) {
		userRepository.delete(userId);
		
	}

}
