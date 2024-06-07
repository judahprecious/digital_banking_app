package com.infy.app.service;

import java.util.List;

import com.infy.app.dto.BankAccountDTO;
import com.infy.app.exception.InfyMeDigitalBankingGlobalExceptionHandler;

public interface BankAccountService 

{
	public List<BankAccountDTO> listAccounts(Long mobileNo) throws InfyMeDigitalBankingGlobalExceptionHandler;

}
