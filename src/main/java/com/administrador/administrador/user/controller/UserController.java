package com.administrador.administrador.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.administrador.administrador.user.User;
import com.administrador.administrador.user.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(value = "user/save")
	public ResponseEntity<Void> saveUser(@RequestBody User user){
		userService.saveUser(user);
		return new ResponseEntity<>( HttpStatus.OK);
	}
	
	@PutMapping(value = "user/changepass")
	public ResponseEntity<Void> changePassword(@RequestBody Integer userId, Integer newPassword){
		userService.changePassword(userId, newPassword);
		return new ResponseEntity<>( HttpStatus.OK);
	}
	
	@DeleteMapping(value = "user/delete")
	public ResponseEntity<Void> deleteUser(@RequestBody Integer userId){
		userService.deleteUserId(userId);
		return new ResponseEntity<>( HttpStatus.OK);
	}
	
	

}
