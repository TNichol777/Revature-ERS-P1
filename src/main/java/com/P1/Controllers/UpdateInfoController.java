package com.P1.Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.P1.ers.dao.UpdateInfoDAO;
import com.P1.ers.dao.UpdateInfoDAOImpl;
import com.P1.ers.dao.UserDAO;
import com.P1.ers.dao.UserDAOImpl;
import com.P1.ers.model.UpdateInfo;
import com.P1.ers.model.User;

/**
 * Servlet implementation class UpdateInfoController
 */
public class UpdateInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateInfoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password = request.getParameter("password");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		HttpSession session = request.getSession();
		int userId = (int) session.getAttribute("userId");
		
		
		  UpdateInfo updateInfo = new UpdateInfo(userId, password, firstname, lastname,
		  phone, email, address); UpdateInfoDAO updateInfoDAO = new
		  UpdateInfoDAOImpl(); updateInfoDAO.updateUserInfoByUsername(updateInfo);
		 
		
		
		/*
		 * User user = new User(userId, password, firstname, lastname, phone, email,
		 * address, address, address); UserDAO userDOA = new UserDAOImpl();
		 * userDOA.updateUser(user);
		 */
		 

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		out.println("<html><body>");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("displayUserDetails-E.jsp");
		dispatcher.include(request, response);
		/*
		 * out.println("You have updated your information");
		 * out.println("<h1><a href=welcome-E.jsp>Login</h1>");
		 */

		
		out.println("</body></html>");
		// DB// store these details
	}

}
