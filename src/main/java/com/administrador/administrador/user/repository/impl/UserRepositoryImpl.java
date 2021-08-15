package com.administrador.administrador.user.repository.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.administrador.administrador.user.User;
import com.administrador.administrador.user.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	Integer nextId = 1;
	
	Map<Integer, User> userMap = new HashMap<>();
	
	public UserRepositoryImpl() {
		
		userMap.put(nextId, new User("alex@gamil.com",1234, "Alex"));
		
	}
	
	
	@Override
	public void save(User user) {
		user.setId(nextId);
		userMap.put(nextId, user);
		nextId =+ 1;
	}

	@Override
	public void changePassword(Integer userId, Integer newPassword) {
		User user = userMap.get(userId);
		user.setPassword(newPassword);
		userMap.replace(userId, user);
	}

	@Override
	public void delete(Integer userId) {
		userMap.remove(userId);
	}

}
