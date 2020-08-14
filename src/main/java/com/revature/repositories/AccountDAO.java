package com.revature.repositories;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.Account;

public class AccountDAO {
	
	private static final Logger log = LogManager.getLogger(AccountDAO.class);

	Account[] accArray= {new Account(600.8, "checking"), new Account(500.0,"savings")};
	
	public Account findById(int id)
	{
		log.info("The account has been found!");
		return accArray[id];
	}
}
