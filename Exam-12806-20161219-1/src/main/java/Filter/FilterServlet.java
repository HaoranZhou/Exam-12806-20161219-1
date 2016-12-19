package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Ben.Customer;

public class FilterServlet implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		HttpSession session = request.getSession();
		Customer customer=(Customer) session.getAttribute("Customer");
		String Path = request.getServletPath();
		if(Path!=null&&("/login.jsp").equals(Path)||("/index.jsp").equals(Path)||("/LoginServlet").equals(Path)){
			arg2.doFilter(request, response);		
		}else {
			
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
