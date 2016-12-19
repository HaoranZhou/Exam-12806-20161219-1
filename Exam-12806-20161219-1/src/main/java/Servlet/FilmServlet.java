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

public class FilmServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FilmDao dao = new FilmDao();
		List<Film> list=dao.findFile();
		HttpSession session = req.getSession();
		session.setAttribute("FilmList", list);
		req.getRequestDispatcher("film.jsp").forward(req, resp);
	}
	
	
}
