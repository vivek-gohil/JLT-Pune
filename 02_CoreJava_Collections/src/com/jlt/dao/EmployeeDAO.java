package com.jlt.dao;

import java.util.ArrayList;
import java.util.List;

import com.jlt.pojo.Employee;

public class EmployeeDAO {

	private List<Employee> employeeList = new ArrayList<Employee>();

	public boolean addEmployee(Employee employee) {
		if (employee != null) {
			employeeList.add(employee);
			return true;
		}
		return false;
	}

	public List<Employee> getAllEmployees() {
		return employeeList;
	}

	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeList) {
			if (employee.getEmployeeId() == employeeId)
				return employee;
		}
		return null;
	}

	public boolean updateEmployeeSalary(int employeeId, double newSalary) {
		for (Employee employee : employeeList) {
			if (employee.getEmployeeId() == employeeId) {
				employee.setSalary(newSalary);
				return true;
			}
		}
		return false;
	}

	public boolean deleteEmployee(int employeeId) {
		for (Employee employee : employeeList) {
			if (employee.getEmployeeId() == employeeId) {
				employeeList.remove(employee);
				return true;
			}
		}
		return false;
	}

}
