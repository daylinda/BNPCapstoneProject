package com.bank.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.application.model.Requests;

@Repository
public interface RequestsDAO extends JpaRepository<Requests, Integer> {

}
