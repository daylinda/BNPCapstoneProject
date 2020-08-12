package com.bank.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.application.model.SavingsAccount;



@Repository
public interface SavingsAccountDAO extends JpaRepository<SavingsAccount, Integer>{
	
	public SavingsAccount findByAccountNumber(long accountNumber);

}
