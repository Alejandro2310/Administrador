package com.administrador.administrador.user.repository;

import java.util.List;

import com.administrador.administrador.user.User;

public interface UserRepository {

	void save(User user);

	void changePassword(Integer userId, String newPassword);

	void delete(Integer userId);

	List<User> showAllUsers();

}
