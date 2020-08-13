package com.revature.models;
import com.revature.services.Services;



public class Account {
	
	public Account() {
		super(); 
	}

	public Account(int accNumber, String userPassword, String userId) {    
		super();
		this.accNumber = accNumber;
		this.userPassword = userPassword;
		this.userId = userId;
	}
	

	public static double balance=500.0;  
	private int accNumber;  
	private String userPassword;  
	private String userId;  
	
	

	
	public void setAccNum(int num) {
		accNumber=num;
	}
	
	public long getAccNum()
	{
		return accNumber;
	}
}
