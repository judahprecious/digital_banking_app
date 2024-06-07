package com.infy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.app.entity.TransactionEntity;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Integer>

{

}
