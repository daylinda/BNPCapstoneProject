package com.bank.application.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.application.dao.SavingsAccountDAO;
import com.bank.application.model.SavingsAccount;
import com.bank.application.service.SavingsAccountService;


@Service
public class SavingsAccountServiceImpl implements SavingsAccountService{
	
	
	@Autowired
	private SavingsAccountDAO dao;
	
	private static long count = 10000000;

	@Override
	public SavingsAccount createSavingsAccount() {
		
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.setAccountNumber(accountGenerator());
		savingsAccount.setAccountBalance(new BigDecimal(0.0));
		dao.save(savingsAccount);
		
		return dao.findByAccountNumber(savingsAccount.getAccountNumber());
	}

	@Override
	public List<SavingsAccount> getAllSavingsAccounts() {
		
		return dao.findAll();
	}
	
	
	private long accountGenerator() {
		return ++count;
	}

	@Override
	public SavingsAccount findByAccountNumber(long accountNumber) {
		
		return dao.findByAccountNumber(accountNumber);
	}
	
	

}
