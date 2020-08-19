package com.revature.services;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.models.Account;

public class ServicesTest {
	
	public static Services sr;
	
	public static double amnt;
	public static Account acc1;
	public static Account acc2;
	public static double balance;
	
	
	@BeforeClass
	public static void setSr()
	{
		sr=new Services();
	}
	
	@Before
	
	public void setVars()
	{
		amnt=50.0;
		balance=500.0;
	}

	
	@After 
	public void clearBalance()
	{
		balance=0.0;
	}
	
	@AfterClass
	public static void clearSr() 
	{
		sr=null;
	}
	
	@Test
	public void testDep()
	{
		balance=sr.Deposit(amnt, acc1);
		assertTrue(balance==550.0);
	
	}
	
	@Test
	
	public void testWith()
	{
		balance=sr.Withdraw(amnt, acc1);
		assertTrue(balance==450);
	}
	
	
	@Test
	public void testTran()
	{
		balance=sr.Transfer(amnt, acc1, acc2);
		assertTrue(balance==450);
	}
}
