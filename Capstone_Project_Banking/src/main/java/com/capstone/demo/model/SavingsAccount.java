package com.capstone.demo.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SavingsAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int savingsAccount_Id;
	private int accountNumber;
	private BigDecimal accountBalance;
	
	@OneToMany(mappedBy = "savingsAccount", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<SavingsTransfers> savingsTransfersList;
	
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public int getSid() {
		return savingsAccount_Id;
	}

	public void setSid(Long sid) {
		this.savingsAccount_Id = savingsAccount_Id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public List<SavingsTransfers> getSavingsTransfersList() {
		return savingsTransfersList;
	}

	public void setSavingsTransfersList(List<SavingsTransfers> savingsTransfersList) {
		this.savingsTransfersList = savingsTransfersList;
	}
	
	
	
	

}
