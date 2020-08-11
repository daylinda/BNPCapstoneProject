package com.capstone.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.demo.dao.SavingsAccountDAO;
import com.capstone.demo.model.SavingsAccount;
import com.capstone.demo.service.SavingsAccountService;

@Service
public class SavingsAccountServiceImpl implements SavingsAccountService{
	
	
	@Autowired
	private SavingsAccountDAO dao;

	@Override
	public SavingsAccount createSavingsAccount(SavingsAccount savingsAccount) {
		
		return dao.save(savingsAccount);
	}

	@Override
	public List<SavingsAccount> getAllSavingsAccounts() {
		
		return dao.findAll();
	}
	
	

}