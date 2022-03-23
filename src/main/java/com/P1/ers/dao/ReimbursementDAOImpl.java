package com.P1.ers.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import com.P1.ers.model.Reimbursement;
import com.P1.ers.model.User;
import com.training.pms.utility.DBConnection;

public class ReimbursementDAOImpl implements ReimbursementDAO {

	private static Logger logger = Logger.getLogger(ReimbursementDAOImpl.class);
	Connection connection = DBConnection.getConnection();

	@Override
	public boolean requestReimbursement(Reimbursement reimbursement) {
		System.out.println("##Adding reimbursement request: " + reimbursement);
		PreparedStatement statement = null;
		int rows = 0;

		try {
			statement = connection.prepareStatement("insert into reimbursement_request values(?,?,?,default)");
			statement.setInt(1, reimbursement.getUserId());
			statement.setString(2, reimbursement.getAmount());
			statement.setString(3, reimbursement.getPurpose());
			rows = statement.executeUpdate();

			System.out.println(rows + "request submitted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (rows == 0)
			return false;
		else
			return true;
	}

	@Override
	public List<Reimbursement> getReimbursement() {
		System.out.println("##Printing reimbursements ");
		List<Reimbursement> reimbursements = new ArrayList<Reimbursement>();

		Statement stat;
		try {
			stat = connection.createStatement();
			ResultSet res = stat.executeQuery("Select * from reimbursement_request where status ='pending'");
			while (res.next()) {
				Reimbursement reimbursement = new Reimbursement();
				reimbursement.setUserId(res.getInt(1));
				reimbursement.setAmount(res.getString(2));
				reimbursement.setPurpose(res.getString(3));
				reimbursement.setStatus(res.getString(4));

				reimbursements.add(reimbursement);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reimbursements;

	}

	@Override
	public List<Reimbursement> getReimbursementById(String userId) {
		System.out.println("##Printing reimbursement for user with user Id " + userId);
		List<Reimbursement> reimbursements = new ArrayList<Reimbursement>();
		int userIdint = Integer.parseInt(userId);
		Statement stat;
		try {
			stat = connection.createStatement();
			ResultSet res = stat.executeQuery("Select * from reimbursement_request where userId = '" + userId + "'");
			while (res.next()) {
				Reimbursement reimbursement = new Reimbursement();
				reimbursement.setUserId(res.getInt(1));
				reimbursement.setAmount(res.getString(2));
				reimbursement.setPurpose(res.getString(3));
				reimbursement.setStatus(res.getString(4));

				reimbursements.add(reimbursement);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reimbursements;
	}

	@Override
	public List<Reimbursement> getResolvedReim() {
		System.out.println("##Printing reimbursements ");
		List<Reimbursement> reimbursements = new ArrayList<Reimbursement>();

		Statement stat;
		try {
			stat = connection.createStatement();
			ResultSet res = stat.executeQuery("Select * from reimbursement_request where status ='approved'");
			while (res.next()) {
				Reimbursement reimbursement = new Reimbursement();
				reimbursement.setUserId(res.getInt(1));
				reimbursement.setAmount(res.getString(2));
				reimbursement.setPurpose(res.getString(3));
				reimbursement.setStatus(res.getString(4));

				reimbursements.add(reimbursement);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reimbursements;

	}

	@Override
	public List<Reimbursement> getResolvedReimById(int userId) {
		System.out.println("##Printing reimbursement for user with user Id " + userId);
		List<Reimbursement> reimbursements = new ArrayList<Reimbursement>();
		// int userIdint = Integer.parseInt(userId);
		Statement stat;
		try {
			stat = connection.createStatement();
			ResultSet res = stat.executeQuery(
					"Select * from reimbursement_request where userId = '" + userId + "' and status ='approved'");
			while (res.next()) {
				Reimbursement reimbursement = new Reimbursement();
				reimbursement.setUserId(res.getInt(1));
				reimbursement.setAmount(res.getString(2));
				reimbursement.setPurpose(res.getString(3));
				reimbursement.setStatus(res.getString(4));

				reimbursements.add(reimbursement);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reimbursements;
	}

	/*
	 * @Override public boolean approveReimbursement() {
	 * System.out.println("##Updating reimbursement"); PreparedStatement statement =
	 * null; int rows = 0;
	 * 
	 * try { statement = connection
	 * .prepareStatement("update reimbursement_request set status ='approved' where userId = ?"
	 * ); statement.setString(1, Reimbursement.getStatus()); rows =
	 * statement.executeUpdate(); System.out.println(rows + "updated successfully");
	 * } catch (SQLException e) { e.printStackTrace(); } if (rows == 0) return
	 * false; else return true;
	 * 
	 * }
	 */

}
