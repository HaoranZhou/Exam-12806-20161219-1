package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Ben.Film;
import Dao.FilmDao;
import Dao.UpdateDao;

public class UpdateServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		long film_id=(long) session.getAttribute("FilmId");
		String title=req.getParameter("film_title");
		String description=req.getParameter("description");
		String language=req.getParameter("language");
		System.out.println(film_id+title+description+language);
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
		UpdateDao dao = new UpdateDao();
		dao.updateFilm(film_id, title, description, language_id);
		List<Film> list = (List<Film>) session.getAttribute("FilmList");
		for(Film f:list){
			if(f.getFilm_id().equals(film_id)){
				f.setDescription(description);
				f.setLanguage_id(language_id);
				f.setTitle(title);
			}
		}
		req.getRequestDispatcher("film.jsp").forward(req, resp);
		
	}
}
