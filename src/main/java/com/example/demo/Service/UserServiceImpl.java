package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.UserRepository;
import com.example.demo.UserInfo.User;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository repository;
    
    @Override
    public List<User> getUser(){
        return repository.findAll();
    }
    
    @Override
    public User addUser(User user) {
        return repository.save(user);
    }
    
    @Override
    public User delUser(String id) {
        User user = repository.findById(id).orElse(null);
        if (user != null) {
            repository.delete(user);
        }
        return user;
    }

    @Override
    public User upUser(String id, User user) {
        User existingUser = repository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setName(user.getName());
            existingUser.setPassword(user.getPassword());
            return repository.save(existingUser);
        }
        return null;
    }
    
    @Override
    public User findUserByName(String name) {
        return repository.findByName(name);
    }
}
