package com.P1.ers.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.log4j.Logger;

import com.P1.ers.model.UpdateInfo;
import com.P1.ers.model.User;
import com.training.pms.utility.DBConnection;

public class UpdateInfoDAOImpl implements UpdateInfoDAO {
	
	private static Logger logger = Logger.getLogger(UserDAOImpl.class);
	Connection connection = DBConnection.getConnection();
	
	
	@Override
	public boolean updateUserInfoByUsername(UpdateInfo updateInfo) {
		System.out.println("##Updating user: " + updateInfo);
		PreparedStatement statement = null;
		int rows = 0;

		try {
			statement = connection.prepareStatement(
					"update users1 set password = ?, firs_tname = ?, last_name = ?, phone_number = ?, email = ?, address = ? where userId = '"+updateInfo.getUserId()+"'");
			statement.setString(1, updateInfo.getPassword());
			statement.setString(2, updateInfo.getFirstname());
			statement.setString(3, updateInfo.getLastname());
			statement.setString(4, updateInfo.getPhone());
			statement.setString(5, updateInfo.getEmail());
			statement.setString(6, updateInfo.getAddress());

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
