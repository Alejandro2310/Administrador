package com.administrador.administrador.user.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.administrador.administrador.seguros.Insurance;
import com.administrador.administrador.user.User;
import com.administrador.administrador.user.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	Integer nextId = 1;
	
	Map<Integer, User> userMap = new HashMap<>();
	
	public UserRepositoryImpl() {
		User firstUser = new User("alex@gamil.com","1234", "Alex");
		firstUser.setId(nextId);
		userMap.put(nextId, firstUser);
		nextId = nextId + 1;
		
	}
	
	
	@Override
	public void save(User user) {
		user.setId(nextId);
		userMap.put(nextId, user);
		nextId = nextId + 1;
	}

	@Override
	public void changePassword(Integer userId, String newPassword) {
		User user = userMap.get(userId);
		user.setPassword(newPassword);
		userMap.replace(userId, user);
	}

	@Override
	public void delete(Integer userId) {
		userMap.remove(userId);
	}


	@Override
	public List<User> showAllUsers() {
		return new ArrayList<User>(userMap.values());
	}

}
