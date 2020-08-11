package com.capstone.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


import com.capstone.demo.model.SavingsAccount;
import com.capstone.demo.service.SavingsAccountService;

@Controller
public class SavingsAccountController {
	
	@Autowired
	private SavingsAccountService savingsAccountService;
	
	@PostMapping("/savingsAccount")
	public SavingsAccount createSavingsAccount(SavingsAccount savingsAccount) {
		return savingsAccountService.createSavingsAccount(savingsAccount);
	}
	

}
