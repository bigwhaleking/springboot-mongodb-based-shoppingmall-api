package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Service.UserService;
import com.example.demo.UserInfo.User;


@Controller 
public class Controllers {

	@GetMapping("/")
	public String main() {
		return "html/login.html";
	}
	
	@GetMapping("/register")
	public String register_page() {
		return "html/register.html";
	}
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/register")
	public String addUsers(User user) {
		userservice.addUser(user);
		return "redirect:index";
	}
	

	@GetMapping("/usermain")
	public String usermain() {
		return "html/usermain.html";
	}
	
	@GetMapping("/adminpage")
	public String adminpage() {
		return "html/adminpage.html";
	}


}
