package com.banking.servcie.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.dao.UserDAO;
import com.banking.exception.BusinessException;
import com.banking.model.User;
import com.banking.servcie.RegisterService;

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
	


