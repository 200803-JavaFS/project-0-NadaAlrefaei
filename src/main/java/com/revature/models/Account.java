package com.revature.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Account {
	
	
	private static final Logger log = LogManager.getLogger(Account.class);

	public static double balance;  
	public String type;
	private int AccNum;
	
	public int getAccNum() {
		return AccNum;
	}

	public void setAccNum(int accNum) {
		AccNum = accNum;
	}

	public Account() {
		super();
	}

	public Account(double balance, String type) {
		super();
		this.balance = balance;
		this.type = type;
		log.info("Your account type is "+ type);
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", type=" + type + "]";
	}
	
	

	
}
