package com.briup.jtest;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.db.Account;
import com.briup.db.AccountDao;

@SuppressWarnings("all")
public class JDBCTest {
	//知识点: spring中配置jdbc的数据源
	@Test
	public void jdbc_dataSource(){
		try {
			String path = "com/briup/db/jdbc/jdbc.xml";
			ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext(path);
			
			AccountDao dao = (AccountDao) container.getBean("dao");
			dao.update(1, 1000);
			container.destroy();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void jdbc_jdbcTemplate(){
		try {
			String path = "com/briup/db/jdbc/jdbcTemplate.xml";
			ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext(path);
			
			AccountDao dao = (AccountDao) container.getBean("dao");
			dao.update(1, 1100);
			container.destroy();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
