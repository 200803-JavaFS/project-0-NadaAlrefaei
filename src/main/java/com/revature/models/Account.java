package com.revature.models;

import java.io.Serializable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Account implements Serializable{
	

	private static final Logger log = LogManager.getLogger(Account.class);
	
	
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	private int userId;
	private double accBalance;
	public int accType;
	private int accNum;
	private int accountId;


	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + accNum;
		result = prime * result + accType;
		result = prime * result + accountId;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Double.doubleToLongBits(accBalance) != Double.doubleToLongBits(other.accBalance))
			return false;
		if (accNum != other.accNum)
			return false;
		if (accType != other.accType)
			return false;
		if (accountId != other.accountId)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}



	public Account() {
		super();
		
	}
	
	
	
	public Account(String userName, String password, double accBalance, int accType, int accNum, int userId) {
		super();
		this.userName = userName;
		this.password = password;
		this.accBalance = accBalance;
		this.accType = accType;
		this.accNum = accNum;
		this.userId = userId;
	}



	public Account(String userName, String password, double accBalance, int accType, int accNum, int accountId,
			int userId) {
		super();
		this.userName = userName;
		this.password = password;
		this.accBalance = accBalance;
		this.accType = accType;
		this.accNum = accNum;
		this.accountId = accountId;
		this.userId = userId;
	}



	public Account(int accNum) {
		super();
		this.accNum = accNum;
		
	}



	public Account(int userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
		User us=new User(userId, password);
		System.out.println("You are logged in.");
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
		String typeName = "";
		if(i==1)
			typeName="Checking Account";
			
		else if(i==2)
			typeName="Saving Account";
		
		return typeName;
	}
	
	


	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public double getAccBalance() {
		return accBalance;
	}



	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}



	public int getAccType() {
		return accType;
	}



	public void setAccType(int accType) {
		this.accType = accType;
	}



	public int getAccNum() {
		return accNum;
	}



	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}



	public int getAccountId() {
		return accountId;
	}



	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	@Override
	public String toString() {
		return "Account [userName=" + userName + ", password=" + password + ", accBalance=" + accBalance + ", accType="
				+ accType + ", accNum=" + accNum + ", accountId=" + accountId + ", userId=" + userId + "]";
	}

	

	
	

	
	

	
}
