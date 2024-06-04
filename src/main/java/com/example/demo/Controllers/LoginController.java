package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.UserService;
import com.example.demo.UserInfo.User;

@RestController
public class LoginController {

	@Autowired
	private UserService userservice;
	
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam("id") String id, @RequestParam("pw") String pw) {
        User user = userservice.findUserByName(id);
        if (user != null && user.getPassword().equals(pw)) {
            return new ResponseEntity<>("Login successful", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Login failed", HttpStatus.UNAUTHORIZED);
        }
    }
}
