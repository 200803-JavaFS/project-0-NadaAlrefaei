package com.revature.services;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ServicesTest {
	
	public static Services sr;
	
	public static double amnt;
	public static double balance;
	//public static int accNumber;
	
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
		//accNumber=12345;
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
		balance=sr.Deposit(amnt);
		assertTrue(balance==550.0);
	
	}
}
