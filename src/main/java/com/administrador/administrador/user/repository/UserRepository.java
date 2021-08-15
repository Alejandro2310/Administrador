package com.administrador.administrador.user.repository;

import com.administrador.administrador.user.User;

public interface UserRepository {

	void save(User user);

	void changePassword(Integer userId, Integer newPassword);

	void delete(Integer userId);

}
