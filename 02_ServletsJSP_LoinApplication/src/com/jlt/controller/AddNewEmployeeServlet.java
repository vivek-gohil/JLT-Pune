package com.jlt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jlt.pojo.EmployeeDetails;

@WebServlet("/AddNewEmployeeServlet")
public class AddNewEmployeeServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		int employeeId = Integer.valueOf(request.getParameter("txtEmployeeId"));
		String name = request.getParameter("txtName");
		double salary = Double.valueOf(request.getParameter("txtSalary"));
		String password = request.getParameter("txtPassword");

		EmployeeDetails employeeDetails = new EmployeeDetails(employeeId, name, salary, password);

		System.out.println(employeeDetails);

		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("employee", employeeDetails);

		PrintWriter out = response.getWriter();
out.println("<h3>Employee registration success !!<h3><a href=EmployeeLogin.html>Login</a>");

		RequestDispatcher dispatcher = request.getRequestDispatcher("NewEmployee.html");
		dispatcher.include(request, response);
	}

}
