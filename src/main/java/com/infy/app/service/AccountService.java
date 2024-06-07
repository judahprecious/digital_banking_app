package com.infy.app.service;

import org.springframework.stereotype.Service;

import com.infy.app.dto.BankAccountDTO;
import com.infy.app.exception.InfyMeDigitalBankingGlobalExceptionHandler;

@Service

public interface AccountService 

{
	public String createAccount(BankAccountDTO bankAccountDTO) throws InfyMeDigitalBankingGlobalExceptionHandler;

}
