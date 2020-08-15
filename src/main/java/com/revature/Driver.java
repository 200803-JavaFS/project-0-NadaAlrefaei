package com.revature;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.Account;
import com.revature.services.Services;




public class Driver {
	
	private static final Logger log = LogManager.getLogger(Driver.class);
	
	private static Services sr=new Services();

	public static void main(String[] args) {
		
		
		
			Account a=sr.findAccById(1);
			
			log.info("Welcome to Bank of Nada Portal!");
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter deposit amount:");
			double dep=scan.nextDouble();
			
			Services de=new Services(Account.balance);
			Account.balance=de.Deposit(dep);
			System.out.println(Account.balance);
		
			
			
			
			
			System.out.println("Enter withdrawl amount: ");
		
			double wth=scan.nextDouble();
			
			Services wi=new Services(Account.balance);
			Account.balance=wi.Withdraw(wth);
			System.out.println(Account.balance);
			
			
			
		//call dao in driver

			
			System.out.println("Enter transfering amount: ");
		
			double transf=scan.nextDouble();
			//System.out.println("Insert the account number you wish to transfer to: ");
			//long transNum=scan.nextLong();
			Services tr=new Services(Account.balance);
			Account a=new Account();
			Account.balance=tr.Transfer(transf, a);
			System.out.println(Account.balance);
			
		
			//private static final Logger log = LogManager.getLogger(Driver.class); 
	
		scan.close();
		
		
		Account b=new Account(); 
		
	}

}
