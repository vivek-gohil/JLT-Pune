package com.jlt.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String url = "jdbc:mysql://localhost:3306/employeedb";
	private String user = "root";
	private String password = "Trupt!V!vek@143";
	private Connection connection;

	public Connection getDBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception :: " + e.getMessage());
		}
		return null;
	}

}
