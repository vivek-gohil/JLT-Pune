package com.jlt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeUpdate {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/employeedb";
		String user = "root";
		String password = "Trupt!V!vek@143";
		String sql_update = "update employee_master set salary = ? where employee_id = ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(url);

			PreparedStatement preparedStatement = connection.prepareStatement(sql_update);
			preparedStatement.setFloat(1, 8000);
			preparedStatement.setInt(2, 101);

			int rowCount = preparedStatement.executeUpdate();
			System.out.println(rowCount + "records updated successfull !!");
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
