package com.revproject.services;

import com.revproject.daos.AccountDao;
import com.revproject.daos.AccountPostgres;

public class AccountService {

private AccountDao id;
	
	public AccountService() {
		id = new AccountPostgres();
	}
}
