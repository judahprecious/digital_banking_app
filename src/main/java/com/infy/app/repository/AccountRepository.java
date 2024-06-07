package com.infy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.app.entity.BankAccountEntity;

public interface AccountRepository extends JpaRepository<BankAccountEntity, Long>

{

}
