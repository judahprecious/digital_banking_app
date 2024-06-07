package com.infy.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DigitalBankAccountEntity {
	
	@Id
	private String DigitalBankingId;
	private Long mobileNumber;
	private Long accountNumber;
	private String accountType;
	
	// Getter and setter
	
	public String getDigitalBankingId() {
		return DigitalBankingId;
	}
	public void setDigitalBankingId(String digitalBankingId) {
		DigitalBankingId = digitalBankingId;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	

}
