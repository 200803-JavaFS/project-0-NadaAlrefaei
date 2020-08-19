package com.revature;

import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.daos.AccountDAO;
import com.revature.models.Account;
import com.revature.models.Bank;
import com.revature.services.Services;




public class Driver {
	
	//logger
	private static final Logger log = LogManager.getLogger(Driver.class);
	
	private static Services sr=new Services();

	private static AccountDAO dao=new AccountDAO();
	
	
	public static void main(String[] args) {
		
		
			double balance=0;
			Bank myAcc=new Bank();
			
			Bank transAcc=new Bank();
			Scanner scan=new Scanner(System.in);
			int choice;
			System.out.println("Welcome to Bank of Nada!");	
			
		
			
				System.out.println("Choose an option to start: ");
				System.out.println("1) Open a new bank account");
				System.out.println("2) Login to exicting account");
				System.out.println("3) Quit");
				choice=scan.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("To open a new account, insert account name: ");
					String customerName=scan.next();
					System.out.println("Insert the opening amount:");
					double newBalance=scan.nextDouble();
					System.out.println("Choose your bank account type: ");
					System.out.println("1) Checking Account");
					System.out.println("2) Saving Account ");
					int type=scan.nextInt();
					System.out.println("Your account number "+myAcc.openNewAcc(newBalance,customerName, type) +" has been created succefully");
					myAcc.setMyAcc(new Account(newBalance,customerName, type));
					balance=newBalance;
					System.out.println(myAcc.getMyAcc());
					
					break;
					
				case 2:
					System.out.println("Enter your User Id:");
					int id=scan.nextInt();
					System.out.println("Enter your Password:");
					String pass=scan.next();
					myAcc.setMyAcc(new Account(id,pass));
					break;
				case 3:
					System.exit(0);
					break;
				}
				
				
				 System.out.println("Choose an option from 1-4: ");
				 System.out.println();
			do {
					
		        System.out.println("1) Deposit to a bank account");
		        System.out.println("2) Withdraw to bank account");
		        System.out.println("3) Transfer to other bank account");
		        System.out.println("4) Print account information");
		        System.out.println("5) Quit");
		      
		        choice = scan.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter deposit amount:");
				double dep=scan.nextDouble();
				System.out.println("Enter your account num:");
				int num=scan.nextInt();				
				if(num==myAcc.getMyAcc().getAccNum()) {
				sr.Deposit(dep, myAcc.getMyAcc());
				}
				else
					System.out.println("You have entered an undefined account number");
				break;
				
			case 2:
				System.out.println("Enter withdrawl amount: ");
				double wth=scan.nextDouble();
				System.out.println("Enter your account num:");
				int num2=scan.nextInt();
				System.out.println(myAcc.getMyAcc());
				if(num2==myAcc.getMyAcc().getAccNum()) {
				sr.Withdraw(wth, myAcc.getMyAcc());
				}
				else
					System.out.println("You have entered an undefined account number");
				break;
				
			case 3:
				System.out.println("Enter transfering amount: ");
				
				double transf=scan.nextDouble();
				transAcc.setMyAcc(new Account());
				
				System.out.println("Insert the account number you wish to transfer from: ");
				int transNum=scan.nextInt();
				myAcc.getMyAcc().setAccNum(transNum);
				if(transNum==transAcc.getMyAcc().getAccNum()) 
				{
					System.out.println("Insert the account number you wish to transfer to: ");
					int transNumTo=scan.nextInt();
					transAcc.getMyAcc().setAccNum(transNumTo);
					int transTo=transAcc.getMyAcc().getAccNum();
					if(transNumTo==transTo)
						sr.Transfer(transf, myAcc.getMyAcc(), transAcc.getMyAcc());
					
					else
						System.out.println("The account you are transfering to is not valid.");
				}
				else
					System.out.println("The account you are transfering from is not valid.");
				break;
			
			case 4:
				sr.accInfo(myAcc.getMyAcc());
				break;
			case 5:
				System.exit(0);
				break;
			}
			}
			
			while(choice!='5');
			List<Account> list=dao.findAll();
			
			for(Account ac:list) {
				System.out.println(ac);
			}
			
			
			scan.close();
			
			
		
 
		
		
		
	}
	
		
}



