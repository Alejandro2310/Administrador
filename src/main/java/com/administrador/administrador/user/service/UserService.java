package com.administrador.administrador.user.service;

import com.administrador.administrador.user.User;

public interface UserService {

	void saveUser(User user);

	void changePassword(Integer userId ,Integer newPassword);

	void deleteUserId(Integer userId);

}
