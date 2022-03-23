package com.P1.Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.P1.ers.dao.UserDAO;
import com.P1.ers.dao.UserDAOImpl;
import com.P1.ers.model.User;

/**
 * Servlet implementation class SignInController
 */
public class SignInController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignInController() {
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text.html");
		out.println("<html><body>");

		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
	//	String emp = request.getParameter("employment");

		HttpSession session = request.getSession();
		session.setAttribute("username", uname);

		UserDAO userDAO = new UserDAOImpl();
		User user = userDAO.validate(uname, pwd);
		session.setAttribute("userId", user.getUserId());
		
		if (user.getEmployment().equals("manager"))
		{
			session.setAttribute("message", "Valid user");

		//	out.println("<h1>Welcome: " + uname);
			RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
			dispatcher.include(request, response);
			/*
			 * out.println(pwd); out.println(uname);
			 */
//			out.println(emp);
			

		}
		else if (user.getEmployment().equals("employee")) {
			session.setAttribute("message", "Valid user");

	//	out.println("<h1>Welcome: " + uname);
		RequestDispatcher dispatcher = request.getRequestDispatcher("welcome-E.jsp");
		dispatcher.include(request, response);
		/*
		 * out.println(pwd); out.println(uname);
		 */}
		
		 
		else {
			out.println("<h1>Your username/password is incorrect, please <a href=login1.html>Login again</h1> ");
		}

		out.println("</body></html>");
	}
}
