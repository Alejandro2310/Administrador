package com.administrador.administrador.user.service;

import java.util.List;

import com.administrador.administrador.user.User;

public interface UserService {

	void saveUser(User user) throws Exception;

	void changePassword(Integer userId ,String newPassword) throws Exception;

	void deleteUserId(Integer userId);

	List<User> showUser();

}
