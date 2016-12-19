package Servlet;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Ben.Film;
import Dao.DeleteDao;

public class DeleteServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		long film_id=Long.parseLong(req.getParameter("id"));
		if(film_id>1000){
			try {
				DeleteDao dao = new DeleteDao();
				PreparedStatement delete = dao.delete();
				delete.setLong(1, film_id);
				delete.execute();
				@SuppressWarnings("unchecked")
				List<Film> list = (List<Film>) session.getAttribute("FilmList");
				for(Iterator it= list.iterator();it.hasNext();){
					Film film=(Film) it.next();
					if(film.getFilm_id().equals(film_id)){
						it.remove();
					}
				}
//				for(Film f:list){
//					if(f.getFilm_id().equals(film_id)){
//						list.remove(f);
//					}
//				}
				req.getRequestDispatcher("film.jsp").forward(req, resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else{
			req.getRequestDispatcher("defeat.jsp").forward(req, resp);
		}
		
	}
}
