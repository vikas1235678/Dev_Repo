package com.security.SecureApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.security.SecureApp.model.User;

@Service
public class UserService {
	List<User> list = new ArrayList<>();
	
	public UserService() {
		list.add(new User("abc","abc@123","abc@gmail.com"));
		list.add(new User("xyz","xyz@123","xyz@gmail.com"));
	}
	
	public List<User> getAllUser(){
		return this.list;
	}
	
	public User getUser(String userName) {
		return this.list.stream()
				.filter(
				e->e.getUsername()
				.equals(userName))
				.findAny()
				.orElse(null);
	}
	
	public User adduser(User user) {
		list.add(user);
		return user;
	}
}
