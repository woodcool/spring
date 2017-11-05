package com.briup.tran.service;

import com.briup.tran.Account;
import com.briup.tran.dao.AccountDao;

public class AccountServiceImpl implements AccountService{
	
	private AccountDao accountDao;
	
	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	@Override
	public void add(Account account) {
		accountDao.save(account);
		throw new RuntimeException("事务测试");
	}

	@Override
	public void update(Account account) {
		
	}

	@Override
	public void remove(Account account) {
		
	}

}
