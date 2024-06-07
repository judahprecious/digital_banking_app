package com.infy.app.exception;

import java.time.LocalDateTime;

//Exceptional Handler Supporter

public class ErrorInformation 
{
	private String errorMessage;
	private Integer errorCode;
	private LocalDateTime errorTimeStamp;
	
	// Getter & Setter
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	public LocalDateTime getErrorTimeStamp() {
		return errorTimeStamp;
	}
	public void setErrorTimeStamp(LocalDateTime errorTimeStamp) {
		this.errorTimeStamp = errorTimeStamp;
	}
	
	

}
