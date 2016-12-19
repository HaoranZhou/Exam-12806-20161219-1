package Dao;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDao {
	public void updateFilm(long film_id,String title,String description,long language_id){
		JdbcFactory factory = new JdbcFactory();
		Statement statement = factory.getStatement();
		String sql="update film set title='"+title+"',description='"+description
				+"',language_id="+language_id+" where film_id="+film_id ;
		try {
			int line = statement.executeUpdate(sql);
			System.out.println(line);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
