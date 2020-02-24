package com.jlt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeSelectMain {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/employeedb";
		String user = "root";
		String password = "Trupt!V!vek@143";
		String sql_select = "select * from employee_master";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, user, password);
			PreparedStatement preparedStatement = connection.prepareStatement(sql_select);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println("Employee_Id \t\t Name \t\t\t Salary");
			while (resultSet.next()) {
				System.out.print(resultSet.getInt("employee_id"));
				System.out.print("\t\t\t" + resultSet.getString("name"));
				System.out.print("\t\t" + resultSet.getFloat("salary"));
			}

			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
