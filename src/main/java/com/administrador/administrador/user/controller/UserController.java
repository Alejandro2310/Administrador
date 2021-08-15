package com.administrador.administrador.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.administrador.administrador.user.User;
import com.administrador.administrador.user.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(value = "user/show")
	public ResponseEntity<List<User>> showUser() throws Exception{
		List<User> users = userService.showUser();
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	@PostMapping(value = "user/save")
	public ResponseEntity<Void> saveUser(@RequestBody User user) throws Exception{
		userService.saveUser(user);
		return new ResponseEntity<>( HttpStatus.OK);
	}
	
	@PutMapping(value = "user/changepass")
	public ResponseEntity<Void> changePassword(@RequestParam Integer userId,@RequestParam String newPassword) throws Exception{
		userService.changePassword(userId, newPassword);
		return new ResponseEntity<>( HttpStatus.OK);
	}
	
	@DeleteMapping(value = "user/delete")
	public ResponseEntity<Void> deleteUser(@RequestParam Integer userId){
		userService.deleteUserId(userId);
		return new ResponseEntity<>( HttpStatus.OK);
	}
	
	

}
