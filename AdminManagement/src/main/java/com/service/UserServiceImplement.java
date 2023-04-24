package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserRepository;
import com.model.User;

@Service
public class UserServiceImplement implements UserService{

	@Autowired
	UserRepository userRepo;

	public User saveUser(User user) {
		return userRepo.save(user);
	}
}
