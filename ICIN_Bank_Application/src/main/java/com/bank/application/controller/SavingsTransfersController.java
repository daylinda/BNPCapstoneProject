package com.bank.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.application.service.SavingsTransfersService;



@Controller
public class SavingsTransfersController {
	
	@Autowired
	private SavingsTransfersService savingsTransferService; 

	@PostMapping("/tranfers")
	public void totransferToOtherUser(@RequestParam("recipientAccountNumber")long receiverAccountNumber,@RequestParam("amount") String amount, @RequestParam("recipient")String recipient,@RequestParam("userAccountNumber")long userAccountNumber) {
		
		savingsTransferService.totransferToOtherUser(receiverAccountNumber, amount, recipient,userAccountNumber);
		
	}

}