package com.bank.application.service;

public interface SavingsTransfersService {
	
	public void totransferToOtherUser(long receiverAccountNumber,String amount,String recipient,long userAccountNumber);

}