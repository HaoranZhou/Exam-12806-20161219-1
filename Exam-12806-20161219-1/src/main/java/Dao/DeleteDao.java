package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DeleteDao {
	public PreparedStatement delete(){
		PreparedStatement prepareStatement =null;
		try {
			String sql="delete from film where film_id=?";
			JdbcFactory factory = new JdbcFactory();
			Connection ps = factory.getPS();
			ps.setAutoCommit(true);
			prepareStatement = ps.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prepareStatement;
	}
}
