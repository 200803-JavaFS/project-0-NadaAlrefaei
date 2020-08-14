package com.revature.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.Account;
import com.revature.repositories.AccountDAO;

public class Services {
	
	private static final Logger log = LogManager.getLogger(Services.class);
	
	public Services() {
		super();
		
	}

	public double AccBalance;
	
	public Services(double accbalance) {
		AccBalance=accbalance;
		
		
	}

	private AccountDAO dao=new AccountDAO();
	
	public Account findAccById(int i)
	{
		log.info("DAO");
		return dao.findById(i);
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
