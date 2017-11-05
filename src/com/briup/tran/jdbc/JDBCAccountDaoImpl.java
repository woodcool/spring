package com.briup.tran.jdbc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.briup.tran.Account;
import com.briup.tran.dao.AccountDao;

public class JDBCAccountDaoImpl implements AccountDao{
	private JdbcTemplate jdbcTemplate;
	@Override
	public void delete(Account account) throws DataAccessException {
		
	}

	@Override
	public void save(Account account) throws DataAccessException {
		int id = account.getId();
		String name = account.getName();
		double balance = account.getBalance();
		String sql = "insert into t_account(id,name,balance) values("+id+",'"+name+"',"+balance+")";
		jdbcTemplate.execute(sql);
		
		
		//如果把dataSource注入dao层来直接使用,则需要注意下面几个点
		/*try {
			//一定不要这样拿conn 因为我们要保证service开始事务和提交事务用的conn和dao层用到的conn是同一个对象
//			Connection conn = dataSource.getConnection();

			//一定要这样去拿conn,因为DataSourceUtils是spring提供的工具类
			Connection conn = DataSourceUtils.getConnection(dataSource);
			
			Statement stmt = conn.createStatement();
			int id = account.getId();
			String name = account.getName();
			double balance = account.getBalance();
			String sql = "insert into t_account(id,name,balance) values("+id+",'"+name+"',"+balance+")";
			stmt.execute(sql);
			
			stmt.close();
			//不要关闭conn 因为这里一关闭conn,在service中就拿不到这个对象了
			//conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
	}

	@Override
	public void update(Account account) throws DataAccessException {
		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
