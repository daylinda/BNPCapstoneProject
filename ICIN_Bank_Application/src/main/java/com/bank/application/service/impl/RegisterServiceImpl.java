package com.bank.application.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.application.dao.UserDAO;
import com.bank.application.model.User;
import com.bank.application.service.RegisterService;


@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private UserDAO dao;
	
	@Override
	public User createUser(User user) {
		return dao.save(user);
	}

	@Override
	public User updateUser(User user) {
		return dao.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return dao.findAll();
	}
		
	}	
	