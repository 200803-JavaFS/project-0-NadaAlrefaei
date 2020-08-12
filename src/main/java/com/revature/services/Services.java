package com.revature.services;

import com.revature.models.Account;

public class Services {
	
	public double AccBalance;
	
	public Services(double accbalance) {
		AccBalance=accbalance;
		
	}

	
	
	public double Deposit(double amount) {
	
		if(amount>=0) {
			AccBalance=AccBalance+amount;
			Account.balance=AccBalance;
			System.out.println("The new balance is: $"+ AccBalance);
			}
			else {
				System.out.println("You entered a negative amount! Your balance is: "+ AccBalance );
			}
		
		return AccBalance;
	}
	
	
	
	public double Withdraw(double amount) {
		
		if(Account.balance>=amount) {
			AccBalance=AccBalance-amount;
			Account.balance=AccBalance;
			System.out.println("The new balance is: $"+ AccBalance);
			}
			else {
				System.out.println("This transaction can not be done, the limit amount you can Withdraw is: "+ AccBalance );
			}
		
		return AccBalance;
	}
	
	
	
		public double Transfer(double amount, Account a) {
		
		if(a.balance>=amount) {
			Withdraw(amount);
			//Deposit(amount);
			System.out.println("You have transfered an amount: $"+ amount+ "to the account "+a.getAccNum() +" sucessfully.");
			}
			else {
				System.out.println("This transaction can not be done, the limit amount you can Transfer is: "+ AccBalance );
			}
		
		return AccBalance;
	}
	
}
