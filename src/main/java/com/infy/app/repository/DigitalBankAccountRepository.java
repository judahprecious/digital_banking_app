package com.infy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.app.entity.DigitalBankAccountEntity;

public interface DigitalBankAccountRepository extends JpaRepository<DigitalBankAccountEntity, String>

{

}
