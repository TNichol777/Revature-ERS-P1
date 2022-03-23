package com.P1.Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.P1.ers.dao.UserDAO;
import com.P1.ers.dao.UserDAOImpl;
import com.P1.ers.dao.ReimbursementDAO;
import com.P1.ers.dao.ReimbursementDAOImpl;
import com.P1.ers.model.Reimbursement;
import com.P1.ers.model.User;

/**
 * Servlet implementation class ReimbursementController
 */
public class ReimbursementController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReimbursementController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String amount = request.getParameter("amount");
		String purpose = request.getParameter("purpose");
		HttpSession session = request.getSession();
		int userId = (int) session.getAttribute("userId");

//pull in user id to add to reimbursement obj
		
		
		Reimbursement reimbursement = new Reimbursement(userId, amount, purpose, "pending");
		
		ReimbursementDAO reimbursementDAO = new ReimbursementDAOImpl();
		reimbursementDAO.requestReimbursement(reimbursement);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("welcome-E.jsp");
		dispatcher.include(request, response);
		out.println("You're reimbursement has been requested");
		out.println("<h1><a welcome.jsp>Return</h1>");

		out.println(reimbursement);
		out.println("</body></html>");
		//DB// store these details

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
