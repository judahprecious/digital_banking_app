package com.infy.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.app.dto.BankAccountDTO;
import com.infy.app.dto.TransactionDTO;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/accounts")

public class AccountApi 
// Autowire required service and logger classes


{
	@PostMapping
	
	public ResponseEntity<String> createAccount(BankAccountDTO bankAccountDTO) 
	{
		//TODO: process POST request
		
		//return ResponseEntity;
		return null;
	}
	
	@GetMapping("/{mobileNo}")
	
	public ResponseEntity<List<BankAccountDTO>> listAccounts(Long mobileNo) 
	{
		//return ResponseEntity;
	    
		return null;
	}
	
//	@PostMapping("/{mobileNo}")
//	
//	public ResponseEntity<String> linkAccount(Long mobileNo, Long accountNo) 
//	{
//		//TODO: process POST request
//		//return ResponseEntity;
//	    
//		return null;
//	}

	@PostMapping("/{mobileNo}")
	
	public ResponseEntity<String> linkAccount(Long mobileNo, Long accountNo, Integer otp) 
	{
		//TODO: process POST request
		//return ResponseEntity;
	    
		return null;
	}
	
	@GetMapping("/balance/{mobileNo}")
	
	public ResponseEntity<Double> checkBalance(Long mobileNo, Long accountNo)
	{
		//return ResponseEntity;
	    
		return null;
		
	}
	
	@PatchMapping("/accounts/fundtransfer")
	
	public ResponseEntity<String> fundTransfer(TransactionDTO transactionDTO)
	{
		//return ResponseEntity;
	    
		return null;
	}
	
	@GetMapping("/statement/{mobileNo}")

	public ResponseEntity<List<TransactionDTO>> accountStatement(Long mobileNo) 
	{
		//return ResponseEntity;
	    
		return null;
				
	}

}
