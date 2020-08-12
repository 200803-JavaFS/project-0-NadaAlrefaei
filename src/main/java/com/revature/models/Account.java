package com.revature.models;

public class Account {
	
	public static double balance=500.0;
	private long accNumber;

	
	public void setAccNum(int num) {
		accNumber=num;
	}
	
	public long getAccNum()
	{
		return accNumber;
	}
}
