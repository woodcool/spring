package com.briup.db.jdbc;


import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.briup.db.AccountDao;

public class JdbcDao implements AccountDao{
	//数据源
	private DataSource dataSorce;
	
	public DataSource getDataSorce() {
		return dataSorce;
	}

	public void setDataSorce(DataSource dataSorce) {
		this.dataSorce = dataSorce;
	}
	
	@Override
	public void update(int id, double balance) {
		try {
			Connection conn  = 
				dataSorce.getConnection();
			System.out.println("in update() of Spring_Jdbc_Dao  conn = "+conn);
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
