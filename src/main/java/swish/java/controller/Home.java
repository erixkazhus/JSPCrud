package swish.java.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String page = request.getParameter("page").toLowerCase();
		switch(page) {
		case "home": 
				request.setAttribute("title","Homepage");
				request.getRequestDispatcher("index.jsp").forward(request, response);
				break;	
		
		default:
			request.setAttribute("title","Error page");
			request.getRequestDispatcher("error.jsp").forward(request, response);
			break;
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	
	//protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//}

}
