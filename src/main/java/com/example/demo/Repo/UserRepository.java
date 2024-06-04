package com.example.demo.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.UserInfo.User;


public interface UserRepository extends MongoRepository<User, String> {
	 User findByName(String name); 
}
