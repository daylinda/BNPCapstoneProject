package com.capstone.demo.service;

import java.util.List;

import com.capstone.demo.model.SavingsAccount;

public interface SavingsAccountService {
	
	public void createSavingsAccount();
	public List<SavingsAccount> getAllSavingsAccounts();
	public SavingsAccount findByAccountNumber(long accountNumber);

}
