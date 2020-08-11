package com.capstone.demo.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.demo.dao.SavingsAccountDAO;
import com.capstone.demo.dao.SavingsTransfersDAO;
import com.capstone.demo.model.SavingsTransfers;
import com.capstone.demo.service.SavingsTransfersService;

@Service
public class SavingsTransfersServiceImpl implements SavingsTransfersService{
	
	@Autowired
	private SavingsTransfersDAO savingsTransfersDao;
	
	@Autowired
	private SavingsAccountDAO savingsAccountDao;

	

	@Override
	public void totransferToOtherUser(long receiverAccountNumber, String amount, String recipient) {
		
		
	}

}
