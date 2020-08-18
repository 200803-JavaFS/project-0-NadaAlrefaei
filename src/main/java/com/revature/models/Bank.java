package com.revature.models;



public class Bank {
	
	private Account[] accounts;
	private int numOfAcc=4;
	Account myAcc;

	
	public Account getMyAcc() {
		return myAcc;
	}

	public void setMyAcc(Account myAcc) {
		this.myAcc = myAcc;
	}

	public Bank()
	{
		accounts=new Account[4];
		numOfAcc=0;
	}
	
	public int openNewAcc(double initialBalance, String customerName, int type) {

		myAcc = new Account(initialBalance, customerName, type);
	    accounts[numOfAcc] = myAcc;
	    numOfAcc++;
	    myAcc.setAccNum(numOfAcc);
	    return myAcc.getAccNum();
	}
	
	
		
	}


