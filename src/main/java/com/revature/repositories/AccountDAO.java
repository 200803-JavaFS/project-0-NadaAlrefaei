package com.revature.repositories;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.Account;

public class AccountDAO {
	
	private static final Logger log = LogManager.getLogger(AccountDAO.class);

	Account[] accArray= {new Account(600.8, "nada",1), new Account(500.0,"ahmad",1)};
	
	public Account findById(int id)
	{
		log.info("The account has been found!");
		return accArray[id];
	}
}
