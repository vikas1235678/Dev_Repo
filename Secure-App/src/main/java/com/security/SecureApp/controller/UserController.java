package com.security.SecureApp.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.SecureApp.model.User;
import com.security.SecureApp.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired																																																																																																																																																																																																																																																																																																																																																																			
	private UserService userService;
	
	//get all user method accessible to only user who is admin
	@RolesAllowed("admin")
	@GetMapping("/getallusers")
	public List<User> getAllUsers() {
		return userService.getAllUser();
	}
	
	//get all user method accessible to only user who is user
	@RolesAllowed("user")
	@GetMapping("/getuserbyname/{userName}")
	public User getUserByUserName(@PathVariable("userName") String userName) {
		return userService.getUser(userName);
	}
	
	@PostMapping("/")
	public User addUser(@RequestBody User user) {
		return userService.adduser(user);
	}
	
}
