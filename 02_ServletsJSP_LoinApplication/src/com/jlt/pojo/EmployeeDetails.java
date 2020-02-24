package com.jlt.pojo;

public class EmployeeDetails {
	private int employeeId;
	private String name;
	private double salary;
	private String password;

	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(int employeeId, String name, double salary, String password) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.password = password;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", password="
				+ password + "]";
	}

}
