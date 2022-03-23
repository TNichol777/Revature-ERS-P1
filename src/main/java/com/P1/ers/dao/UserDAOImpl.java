package com.P1.ers.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import com.P1.ers.model.User;
import com.training.pms.utility.DBConnection;

public class UserDAOImpl implements UserDAO {

	private static Logger logger = Logger.getLogger(UserDAOImpl.class);
	Connection connection = DBConnection.getConnection();

	public boolean register(User user) {
		System.out.println("##Adding user: " + user);
		PreparedStatement statement = null;
		int rows = 0;

		try {
			statement = connection.prepareStatement("insert into users1 values(default,?,?,?,?,?,?,?,?)");
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getFirstname());
			statement.setString(4, user.getLastname());
			statement.setString(5, user.getPhone());
			statement.setString(6, user.getEmail());
			statement.setString(7, user.getAddress());
			statement.setString(8, user.getEmployment());
			rows = statement.executeUpdate();

			System.out.println(rows + "user registered successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (rows == 0)
			return false;
		else
			return true;
	}

	public User validate(String username, String password) {
		User user = new User();
		PreparedStatement stat;
		try {
			stat = connection.prepareStatement("Select * from users1 where username = ? and password = ? ");
			stat.setString(1, username);
			stat.setString(2, password);

			ResultSet res = stat.executeQuery();
			res.next();
			user.setUserId(res.getInt(1));
			user.setUsername(res.getString(2));
			user.setPassword(res.getString(3));
			user.setFirstname(res.getString(4));
			user.setLastname(res.getString(5));
			user.setPhone(res.getString(6));
			user.setEmail(res.getString(7));
			user.setAddress(res.getString(8));
			user.setEmployment(res.getString(9));

			System.out.println(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		logger.info("successfully validated");
		return user;

	}

	@Override
	public List<User> getUserInfo() {
		System.out.println("##Printing all users ");
		List<User> users = new ArrayList<User>();

		Statement stat;
		try {
			stat = connection.createStatement();
			ResultSet res = stat.executeQuery("Select * from users1");
			while (res.next()) {
				User user = new User();
				user.setUserId(res.getInt(1));
				user.setUsername(res.getString(2));
				user.setPassword(res.getString(3));
				user.setFirstname(res.getString(4));
				user.setLastname(res.getString(5));
				user.setPhone(res.getString(6));
				user.setEmail(res.getString(7));
				user.setAddress(res.getString(8));
				user.setEmployment(res.getString(9));

				users.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;

	}

	@Override
	public List<User> getUserByUserName(String username) {
		System.out.println("##Printing searched users ");
		List<User> users = new ArrayList<User>();

		Statement stat;
		try {
			stat = connection.createStatement();
			ResultSet res = stat.executeQuery("select * from users1 where username = '" + username + "'");
			while (res.next()) {
				User user = new User();
				user.setUserId(res.getInt(1));
				user.setUsername(res.getString(2));
				user.setPassword(res.getString(3));
				user.setFirstname(res.getString(4));
				user.setLastname(res.getString(5));
				user.setPhone(res.getString(6));
				user.setEmail(res.getString(7));
				user.setAddress(res.getString(8));
				user.setEmployment(res.getString(9));

				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;

	}

	

	@Override
	public List<User> getUserInfoByUsername(String username) {
		System.out.println("##Printing all users " +username);
		List<User> users = new ArrayList<User>();

		Statement stat;
		try {
			stat = connection.createStatement();
			ResultSet res = stat.executeQuery("Select * from users1 where username = '"+username+"'");
			while (res.next()) {
				User user = new User();
				user.setUserId(res.getInt(1));
				user.setUsername(res.getString(2));
				user.setPassword(res.getString(3));
				user.setFirstname(res.getString(4));
				user.setLastname(res.getString(5));
				user.setPhone(res.getString(6));
				user.setEmail(res.getString(7));
				user.setAddress(res.getString(8));
				user.setEmployment(res.getString(9));

				users.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;

	}

	@Override
	public boolean updateUser(User user) {
System.out.println("##Updating user: " +user);
PreparedStatement statement = null;
int rows = 0;

try { 
	statement = connection.prepareStatement("update users1 set password = ?, firs_tname = ?, last_name = ?, phone_number = ?, email = ?, address = ? where userId = '"+user+"'");
	statement.setString(1, user.getPassword());
	statement.setString(2, user.getFirstname());
	statement.setString(3, user.getLastname());
	statement.setString(4, user.getPhone());
	statement.setString(5, user.getEmail());
	statement.setString(6, user.getAddress());

	rows = statement.executeUpdate();
	System.out.println(rows + "updated siccessfully");

} catch (SQLException e) {
	e.printStackTrace();
}
if (rows == 0)
	return false;
else
	return true;
}
}

