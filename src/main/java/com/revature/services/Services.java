package com.revature.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.revature.models.Account;


public class Services {
	
	private static final Logger log = LogManager.getLogger(Services.class);
	
	private Account myAcc = new Account();
	public double amnt;
	
	public Services() {
		super();
		
	}
	

	public Services(double amnt,Account myAcc) {
		super();
		this.amnt=amnt;
		this.myAcc = myAcc;
	}


	
	
	
	
	public double Deposit(double amount, Account a) {
	
		amnt=amount;
		myAcc.setAccBalance(a.getAccBalance());
		double totalBalance=myAcc.getAccBalance();
		if(amnt>=0) {
			totalBalance=totalBalance + amnt;
			a.setAccBalance(totalBalance);
			System.out.println("The new balance is: $"+ totalBalance);
			}
			else {
				System.out.println("You entered a negative amount! Your balance is: "+ totalBalance );
			}
		return totalBalance;
		
	}
	
	
	
	public double Withdraw(double amount, Account a) {
		
		amnt=amount;
		System.out.println(a);
		myAcc.setAccBalance(a.getAccBalance());
		double totalBalance=myAcc.getAccBalance();
		if(totalBalance>=amnt) {
			totalBalance=totalBalance-amnt;
			a.setAccBalance(totalBalance);
			System.out.println("The new balance is: $"+ totalBalance);
			}
			else {
				System.out.println("This transaction can not be done, the limit amount you can Withdraw is: "+ totalBalance );
			}
		return totalBalance;
		
	}
	
	
	
		public double Transfer(double amount, Account a, Account b) {
		
			amnt=amount;
			double totalBalance=myAcc.getAccBalance();
				if(totalBalance>=amnt) {
					Withdraw(amnt, a);
					Deposit(amnt, b);
			System.out.println("You have transfered an amount: $"+ amount+ " to "+b.getUserName() +"'s Account sucessfully.");
			}
			else {
				System.out.println("This transaction can not be done, the limit amount you can Transfer is: "+ totalBalance);
			}
		
		return totalBalance;
	}
		
		
		public String accInfo(Account a) {
			return "Account Number "+ a.getAccNum() +"Customer Name: "+ a.getUserName();
		}
		
		
		
	
}
