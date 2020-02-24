package com.jlt.main;

import java.util.List;
import java.util.Scanner;

import com.jlt.dao.EmployeeDAO;
import com.jlt.pojo.Employee;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		int employeeId;
		String name;
		double salary;
		int i = 0;

		Scanner scanner = new Scanner(System.in);
		EmployeeDAO employeeDAO = new EmployeeDAO();
		do {
			System.out.println("Enter EmployeeId");
			employeeId = scanner.nextInt();
			System.out.println("Name");
			name = scanner.next();
			System.out.println("Salary");
			salary = scanner.nextDouble();

			Employee employee = new Employee(employeeId, name, salary);

			if (employeeDAO.addEmployee(employee))
				System.out.println("Employee Added Successfully !!");
			else
				System.out.println("Faile To Add Employee");
			i++;
		} while (i < 3);

		System.out.println("-----------------------------------------------------");

		System.out.println("Display All Employees ");

		List<Employee> employeeList = employeeDAO.getAllEmployees();

		for (Employee emp : employeeList) {
			System.out.println(emp);
		}

		System.out.println("-----------------------------------------------------");

		System.out.println("Enter EmployeeId ");
		employeeId = scanner.nextInt();
		Employee employee = employeeDAO.getEmployeeByEmployeeId(employeeId);
		if (employee != null)
			System.out.println(employee);
		else
			System.out.println("No employee found !!");

		System.out.println("-----------------------------------------------------");
		System.out.println("Update Employee Salary");
		System.out.println("Enter EmployeeId");
		employeeId = scanner.nextInt();
		System.out.println("Salary");
		salary = scanner.nextDouble();
		if (employeeDAO.updateEmployeeSalary(employeeId, salary))
			System.out.println("Details Updated Successfully !!");
		else
			System.out.println("No employee found !!");
		System.out.println("-----------------------------------------------------");

		System.out.println("Display All Employees ");

		employeeList = employeeDAO.getAllEmployees();

		for (Employee emp : employeeList) {
			System.out.println(emp);
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("Delete Employee Salary");
		System.out.println("Enter EmployeeId");
		employeeId = scanner.nextInt();
		if (employeeDAO.deleteEmployee(employeeId))
			System.out.println("Employee Deleted Successfully !!");
		else
			System.out.println("No employee found !!");
		System.out.println("-----------------------------------------------------");

		System.out.println("Display All Employees ");

		employeeList = employeeDAO.getAllEmployees();

		for (Employee emp : employeeList) {
			System.out.println(emp);
		}

	}
}
