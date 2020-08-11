package com.capstone.demo.service.impl;

import java.math.BigDecimal;
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
	
	private static long count = 10000000;

	@Override
	public SavingsAccount createSavingsAccount(SavingsAccount savingsAccount) {
		
		savingsAccount.setAccountNumber(accountGenerator());
		savingsAccount.setAccountBalance(new BigDecimal(0.0));
		return dao.save(savingsAccount);
	}

	@Override
	public List<SavingsAccount> getAllSavingsAccounts() {
		
		return dao.findAll();
	}
	
	
	private long accountGenerator() {
		return ++count;
	}
	
	

}
