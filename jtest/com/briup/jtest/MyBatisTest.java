package com.briup.jtest;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.db.AccountDao;

@SuppressWarnings("all")
public class MyBatisTest {
	//知识点: spring中使用mybatis
	@Test
	public void mybatis_update(){
		try {
			String path = "com/briup/db/mybatis/spring_mybatis.xml";
			ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext(path);
			
			AccountDao dao = (AccountDao) container.getBean("accountDao");
			dao.update(1, 1200);
			System.out.println(dao.getClass());
			container.destroy();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
