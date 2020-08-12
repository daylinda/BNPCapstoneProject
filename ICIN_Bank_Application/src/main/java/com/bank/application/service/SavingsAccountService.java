package com.bank.application.service;

import java.util.List;

import com.bank.application.model.SavingsAccount;



public interface SavingsAccountService {
	
	public SavingsAccount createSavingsAccount();
	public List<SavingsAccount> getAllSavingsAccounts();
	public SavingsAccount findByAccountNumber(long accountNumber);

}
