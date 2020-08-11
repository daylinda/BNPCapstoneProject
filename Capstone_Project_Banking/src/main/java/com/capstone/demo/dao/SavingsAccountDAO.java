package com.capstone.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.demo.model.SavingsAccount;

@Repository
public interface SavingsAccountDAO extends JpaRepository<SavingsAccount, Integer>{

}
