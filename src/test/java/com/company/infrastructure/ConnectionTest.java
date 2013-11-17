package com.company.infrastructure;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConnectionTest {

	ConnectionUtil conn;
	
	@Before
	public void setUp() throws Exception {
		conn = new ConnectionUtil();
	}

	@After
	public void tearDown() throws Exception {
		conn.close();
	}

	@Test
	public void shouldOpenConnection() throws SQLException {
		assertTrue(conn.isOpen());
	}
	
	@Test
	public void shouldCloseConnection() throws SQLException {
		conn.close();
		assertFalse(conn.isOpen());
	}

}
