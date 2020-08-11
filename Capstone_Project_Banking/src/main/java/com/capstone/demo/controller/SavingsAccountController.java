package com.capstone.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;



import com.capstone.demo.service.SavingsAccountService;

@Controller
public class SavingsAccountController {
	
	@Autowired
	private SavingsAccountService savingsAccountService;
	
	@PostMapping("/savingsAccount")
	public void createSavingsAccount() {
		savingsAccountService.createSavingsAccount();
	}
	

}
