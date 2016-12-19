package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDao {
	public PreparedStatement insert( ){
		PreparedStatement prepareStatement=null;
		try {
			String sql="insert into film (title,description,language_id)values(?,?,?)";
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
