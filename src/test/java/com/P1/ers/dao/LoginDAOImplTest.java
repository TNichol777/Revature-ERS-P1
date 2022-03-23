package com.P1.ers.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.P1.ers.model.User;

class LoginDAOImplTest {
	
	UserDAO userDAO;
	


	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	userDAO = new UserDAOImpl();
	
	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Testing get users 1")
	void testGetUser() {
		List<User> uList = userDAO.getUserInfo();
		for(User obj : uList)
			System.out.println(obj);
		
		assertTrue(uList.size() > 0 );

	}

}
