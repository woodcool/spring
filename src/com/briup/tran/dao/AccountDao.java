package com.briup.tran.dao;

import org.springframework.dao.DataAccessException;

import com.briup.tran.Account;

public interface AccountDao {
	void save(Account account) throws DataAccessException;
	void update(Account account) throws DataAccessException;
	void delete(Account account) throws DataAccessException;
}
