package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Ben.Customer;
import Service.LoginService;

public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		Customer customer=new Customer(username);
		LoginService service=new LoginService();
		boolean flag = service.Login(username);
		HttpSession session = req.getSession();
		if(flag==true){
			session.setAttribute("Customer", customer);
			req.getRequestDispatcher("film").forward(req, resp);
			
		}
		else{
			req.getRequestDispatcher("default.jsp").forward(req, resp);
		}
		
	}
}
