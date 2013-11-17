package com.company.infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	Connection connection;
	
	public ConnectionUtil() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432", "user", "pass");
	}
	
	public void close() throws SQLException {
		connection.close();		
	}

	public boolean isOpen() throws SQLException {
		return !connection.isClosed();
	}

}
