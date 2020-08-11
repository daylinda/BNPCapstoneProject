package com.capstone.demo.service.impl;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.demo.dao.SavingsAccountDAO;
import com.capstone.demo.dao.SavingsTransfersDAO;
import com.capstone.demo.model.SavingsAccount;
import com.capstone.demo.model.SavingsTransfers;
import com.capstone.demo.service.SavingsTransfersService;

@Service
public class SavingsTransfersServiceImpl implements SavingsTransfersService{
	
	@Autowired
	private SavingsTransfersDAO savingsTransfersDao;
	
	@Autowired
	private SavingsAccountDAO savingsAccountDao;


	@Override
	public void totransferToOtherUser(long recipientAccountNumber, String amount, String recipient,long userAccountNumber) {
		BigDecimal amountToBeTransfered = new BigDecimal(amount);
		SavingsAccount userSavingsAccount = savingsAccountDao.findByAccountNumber(userAccountNumber);
		SavingsAccount recipientSavingsAccount = savingsAccountDao.findByAccountNumber(recipientAccountNumber);
		Date date = new Date();
		if(userSavingsAccount.getAccountBalance().compareTo(amountToBeTransfered)==1||userSavingsAccount.getAccountBalance().compareTo(amountToBeTransfered)==0) {
			userSavingsAccount.setAccountBalance(userSavingsAccount.getAccountBalance().subtract(amountToBeTransfered));
			
			if(recipientSavingsAccount!=null) {
				recipientSavingsAccount.setAccountBalance(recipientSavingsAccount.getAccountBalance().add(amountToBeTransfered));
				savingsAccountDao.save(recipientSavingsAccount);
			}
			
			savingsAccountDao.save(userSavingsAccount);
			SavingsTransfers savingsTransfers = new SavingsTransfers(date, recipient, recipientAccountNumber, Double.parseDouble(amount),"Finsihed",userSavingsAccount);
			savingsTransfersDao.save(savingsTransfers);
		}else {
			SavingsTransfers savingsTransfers = new SavingsTransfers(date, recipient, recipientAccountNumber, Double.parseDouble(amount),"Cancelled,Inadequate balance",userSavingsAccount);
			savingsTransfersDao.save(savingsTransfers);
		}
				
	}

}
