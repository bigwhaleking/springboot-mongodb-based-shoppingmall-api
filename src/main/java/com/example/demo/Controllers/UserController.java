package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.UserService;
import com.example.demo.UserInfo.User;

@RestController
@RequestMapping("/register")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@GetMapping("/all")
	public List<User> getUser(){
		return userservice.getUser();
	}
	
//	@PostMapping("/insert")
//	public User insert(User user) {
//		return userservice.addUser(user);
//	}
	
	@DeleteMapping("/delete/{id}")
	public User delete(@PathVariable String id) {
		return userservice.delUser(id);
	}
	
	
}
