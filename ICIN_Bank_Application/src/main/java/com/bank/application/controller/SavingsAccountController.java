package com.bank.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.bank.application.model.SavingsAccount;
import com.bank.application.service.SavingsAccountService;





@Controller
public class SavingsAccountController {
	
	@Autowired
	private SavingsAccountService savingsAccountService;
	
	@PostMapping("/savingsAccount")
	public SavingsAccount createSavingsAccount() {
		return savingsAccountService.createSavingsAccount();
	}
	

}