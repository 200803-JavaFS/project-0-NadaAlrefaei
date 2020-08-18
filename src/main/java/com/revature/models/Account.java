package com.revature.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Account {
	
	
	private static final Logger log = LogManager.getLogger(Account.class);

	
	private int accNum;
	private String userName;
	private double accBalance;
	public int accType;
	private String typeName;
	//public boolean isActive;
	//private int userId;
	//private String password;
	//private int accountId;
	
	public Account() {
		super();
	}
	
	public Account(double balance, int type) {
		super();
		accBalance = balance;
		accType = type;
		log.info("Your account type is "+Type(accType)+" , you balance is: "+ accBalance);
	}

	

	public Account(double accBalance,String userName, int acctype) {
		super();
		this.userName = userName;
		this.accBalance = accBalance;
		this.accType = acctype;
		log.info("Hello " +userName+ "Your account type is "+accType+" , you balance is: "+ accBalance);
		
	}

	
	public String Type(int i)
	{
		if(i==1)
			System.out.println("Checking Account");
		else if(i==2)
			System.out.println("Saving Account");
		
		return typeName;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int num) {
		accNum = num;
	}

	
	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", userName=" + userName + ", accBalance=" + accBalance + ", type=" + accType
				+ "]";
	}

	
	

	
	

	
}
