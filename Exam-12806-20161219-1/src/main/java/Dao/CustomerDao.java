package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDao {
	public String findCustomerByName(String username){
		String sql="select first_name from customer where first_name='"+username+"'";
		String name=null;
		
		JdbcFactory factory = new JdbcFactory();
		try {
			ResultSet executeQuery = factory.getStatement().executeQuery(sql);
			while(executeQuery.next()){
				name=executeQuery.getString("first_name");
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name;
	}
}
