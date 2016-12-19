package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Ben.Film;

public class FilmDao {
	public List<Film> findFile(){
		Film film=null;
		List list = new ArrayList<Film>();
		try {
			String sql="select f.film_id,f.title,f.description,l.name from film f,language l where f.language_id=l.language_id";
			JdbcFactory factory=new JdbcFactory();
			Statement statement = factory.getStatement();
			ResultSet executeQuery = statement.executeQuery(sql);
			while(executeQuery.next()){
				long film_id=executeQuery.getLong("film_id");
				String title=executeQuery.getString("title");
				String language=executeQuery.getString("name");
				String description=executeQuery.getString("description");
				film=new Film(language, film_id, title, description);
				list.add(film);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
