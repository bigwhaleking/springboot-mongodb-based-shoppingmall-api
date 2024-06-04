package com.example.demo.Service;

import java.util.List;

import com.example.demo.UserInfo.User;


public interface UserService {
    
    List<User> getUser();
    
    User addUser(User user);
    
    User delUser(String id);
    
    User upUser(String id, User user);
    
    User findUserByName(String name);
}