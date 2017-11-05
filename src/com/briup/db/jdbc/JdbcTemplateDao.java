package com.briup.db.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import com.briup.db.AccountDao;

public class JdbcTemplateDao implements AccountDao{
	private JdbcTemplate jdbcTemplate;

	@Override
	public void update(int id, double balance) {
		String updateSql = "update t_account set balance=? where id=?";
		jdbcTemplate.update(updateSql,balance,id);
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
    
}
