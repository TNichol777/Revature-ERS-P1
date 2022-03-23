package com.P1.Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.P1.ers.dao.UserDAO;
import com.P1.ers.dao.UserDAOImpl;
import com.P1.ers.model.User;

/**
 * Servlet implementation class SignUpController
 */
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignUpController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * String username = request.getParameter("username"); String password =
		 * request.getParameter("password"); String firstname =
		 * request.getParameter("firstname"); String lastname =
		 * request.getParameter("lastname");
		 * 
		 * String phone = request.getParameter("phone"); String email =
		 * request.getParameter("email"); String address =
		 * request.getParameter("address"); String employment =
		 * request.getParameter("employment");
		 * 
		 * String gender = request.getParameter("gender"); String notification[] =
		 * request.getParameterValues("notification"); String qualification =
		 * request.getParameter("qualification"); String finalNotification = null;
		 * 
		 * 
		 * 
		 * for(String temp:notification) { finalNotification += temp +":";
		 * //Email:SMS:Courier }
		 * 
		 * User user = new User(-1, username, password, firstname, lastname, phone,
		 * email, address, phone, email, address, employment, gender, finalNotification,
		 * qualification);
		 * 
		 * LoginDAO loginDAO = new LoginDAOImpl(); loginDAO.register(user);
		 * 
		 * PrintWriter out = response.getWriter(); response.setContentType("text/html");
		 * 
		 * out.println("<html><body>"); out.println("Welcome " +username);
		 * out.println("You are registered succesfully and your password is: "
		 * +password); out.println("<h1><a href=login.html>Login</h1>");
		 * 
		 * out.println(user); out.println("</body></html>"); //DB// store these details
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");

		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String employment = request.getParameter("employment");
		
		User user = new User(-1, username, password, firstname, lastname, phone, email, address,
				employment);

		UserDAO userDAO = new UserDAOImpl();
		userDAO.register(user);
		RequestDispatcher dispatcher = request.getRequestDispatcher("login1.html");
		dispatcher.include(request, response);
		/*
		 * PrintWriter out = response.getWriter(); response.setContentType("text/html");
		 * 
		 * out.println("<html><body>"); out.println("Welcome " + username);
		 */
		
		/*
		 * out.println("You are registered succesfully and your password is: " +
		 * password); out.println("<h1><a href=login1.html>Login</h1>");
		 */

		/*
		 * out.println(user); out.println("</body></html>");
		 */
		// DB// store these details
	}
}
