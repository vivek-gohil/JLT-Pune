package com.jlt.main;

import java.util.Scanner;

import com.jlt.dao.EmployeeDAO;
import com.jlt.pojo.Employee;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		int employeeId;
		String name;
		double salary;
		int choice;
		String continueChoice = "";

		Scanner scanner = new Scanner(System.in);
		EmployeeDAO employeeDAO = new EmployeeDAO();

		do {
			
			System.out.println("Do your want to continue ?");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));
	}
}
