package com.capstone.demo.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SavingsTransfers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int savingsTransfers_Id;
	private int receiverAccountNumber;
	private BigDecimal transferAmount;
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "savings_Account_Id")
	private SavingsAccount savingsAccount;
	
	public SavingsTransfers() {
		// TODO Auto-generated constructor stub
	}

	public int getSavingsTransfers_Id() {
		return savingsTransfers_Id;
	}

	public void setSavingsTransfers_Id(int savingsTransfers_Id) {
		this.savingsTransfers_Id = savingsTransfers_Id;
	}

	public int getReceiverAccountNumber() {
		return receiverAccountNumber;
	}

	public void setReceiverAccountNumber(int receiverAccountNumber) {
		this.receiverAccountNumber = receiverAccountNumber;
	}

	public BigDecimal getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(BigDecimal transferAmount) {
		this.transferAmount = transferAmount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}
	
	
	

}
