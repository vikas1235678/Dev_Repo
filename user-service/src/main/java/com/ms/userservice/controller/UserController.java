package com.ms.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.userservice.entity.Users;
import com.ms.userservice.service.UserService;
import com.ms.userservice.valueobject.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public Users saveUser(@RequestBody Users user) {
		log.info("inside saveUser method and UserController");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{userId}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("userId") Long userId) {
		log.info("inside get user with department method and UserController");
		return userService.getUserWithDepartment(userId);
	}
	
}
