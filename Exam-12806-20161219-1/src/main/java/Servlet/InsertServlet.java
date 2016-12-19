package Servlet;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.InsertDao;

public class InsertServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title=req.getParameter("film_title");
		String description=req.getParameter("description");
		String language=req.getParameter("language");
		long language_id=0;
		if(language.equals("English")){
			language_id=1;
		}
		if(language.equals("Italian")){
			language_id=2;
		}
		if(language.equals("Japanese")){
			language_id=3;
		}
		if(language.equals("Mandarin")){
			language_id=4;
		}
		if(language.equals("French")){
			language_id=5;
		}
		if(language.equals("German")){
			language_id=6;
		}
		InsertDao dao = new InsertDao();
		PreparedStatement ps = dao.insert();
		try {
			ps.setString(1, title);
			ps.setString(2, description);
			ps.setLong(3, language_id);
			int executeUpdate = ps.executeUpdate();
//			System.out.println(executeUpdate);
			req.getRequestDispatcher("film.jsp").forward(req, resp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
