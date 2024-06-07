package com.infy.app.service;

import com.infy.app.exception.InfyMeDigitalBankingGlobalExceptionHandler;

public interface DigitalBankAccountService

{
	public String linkAccount(Long mobileNo, Long accountNo) throws InfyMeDigitalBankingGlobalExceptionHandler;
	public String linkAccount(Long mobileNo, Long accountNo, Integer OTP) throws InfyMeDigitalBankingGlobalExceptionHandler;
	public Double checkBalance(Long mobileNo, Long accountNo) throws InfyMeDigitalBankingGlobalExceptionHandler;	

}
