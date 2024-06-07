package com.infy.app.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice
//parental class

public class InfyMeDigitalBankingGlobalExceptionHandler extends Exception

{
	public InfyMeDigitalBankingGlobalExceptionHandler(String message)
	{
		super(message);
	}

}
