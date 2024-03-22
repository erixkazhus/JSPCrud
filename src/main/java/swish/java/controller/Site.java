package swish.java.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import swish.java.entity.User;
import swish.java.model.UsersModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/site")
public class Site extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page").toLowerCase();
		switch(page) {		
			
		case "listusers": 
			listusers(request, response);
			break;
		case "adduser": 
			adduser(request, response);
			break;
		case "updateuser": 
			updateuser(request, response);
			break;
			
		case "deleteuser": 
			new UsersModel().deleteUser(Integer.parseInt(request.getParameter("userid")));
			listusers(request, response);
			break;	
		
		default:
			request.setAttribute("title","Error page");
			request.getRequestDispatcher("error.jsp").forward(request, response);
			break;
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String form = request.getParameter("form");
		switch(form) {		
			
		case "addUserOperation": 
			User user = new User(request.getParameter("username"), request.getParameter("Email"));
			new UsersModel().addUser(user);			
			 response.sendRedirect(request.getContextPath() + "/site?page=listusers");	          
			break;
			
		case "updateUserOperation": 
			User updated_user = new User(Integer.parseInt(request.getParameter("userid")), request.getParameter("username"), request.getParameter("Email"));
			new UsersModel().updateUser(updated_user);			
			 response.sendRedirect(request.getContextPath() + "/site?page=listusers");	          
			break;
			
		default:
			request.setAttribute("title","Error page");
			request.getRequestDispatcher("error.jsp").forward(request, response);
			break;
		}
	}
	
	protected void listusers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<User> users = new ArrayList<>();
		users = new UsersModel().listuser();
		request.setAttribute("listusers", users);
		request.setAttribute("title","List users");
		request.getRequestDispatcher("listusers.jsp").forward(request, response);
	}
	

	protected void adduser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("title","Add User");
		request.getRequestDispatcher("adduser.jsp").forward(request, response);
	}
	
	protected void updateuser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			request.setAttribute("title","Update User");
			request.getRequestDispatcher("updateuser.jsp").forward(request, response);
		}

}
