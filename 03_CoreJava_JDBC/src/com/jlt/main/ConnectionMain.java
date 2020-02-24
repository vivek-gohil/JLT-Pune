package com.jlt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionMain {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/employeedb";
		String user = "root";
		String password = "Trupt!V!vek@143";
		String sql_insert = "insert into employee_master values(?,?,?)";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.. Driver loaded successfully !!");

			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("2.. Connection Success !!");

			PreparedStatement preparedStatement = connection.prepareStatement(sql_insert);
			preparedStatement.setInt(1, 101);
			preparedStatement.setString(2, "Vivek Gohil");
			preparedStatement.setFloat(3, (float) 1000.0);
			System.out.println("3.. PreparedStatement is created !!");

			int rowCount = preparedStatement.executeUpdate();
			System.out.println(rowCount + " :: Recoreds inserted !!");

			connection.close();
			System.out.println("3.. Connection Closed !!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception :: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
