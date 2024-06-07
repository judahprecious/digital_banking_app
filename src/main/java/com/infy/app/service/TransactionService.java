package com.infy.app.service;

import java.util.List;

import com.infy.app.dto.TransactionDTO;
import com.infy.app.exception.InfyMeDigitalBankingGlobalExceptionHandler;

public interface TransactionService 

{
	public String fundTransfer(TransactionDTO transactionDTO) throws InfyMeDigitalBankingGlobalExceptionHandler;
	public List<TransactionDTO> accountStatement(Long mobileNo) throws InfyMeDigitalBankingGlobalExceptionHandler;
	

}
