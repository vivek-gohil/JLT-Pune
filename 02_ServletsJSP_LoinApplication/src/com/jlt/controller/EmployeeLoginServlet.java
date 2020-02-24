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

@WebServlet("/EmployeeLoginServlet")
public class EmployeeLoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int employeeId = Integer.valueOf(request.getParameter("txtEmployeeId"));
		String password = request.getParameter("txtPassword");

		HttpSession httpSession = request.getSession();
		EmployeeDetails details = (EmployeeDetails) httpSession.getAttribute("employee");

		System.out.println(details);

		PrintWriter out = response.getWriter();
		if (details != null) {
	if (details.getEmployeeId() == employeeId && details.getPassword().equals(password))
				response.sendRedirect("HomeServlet");
			else {
				out.println("<h3>Invalid EmployeeId or Password !!<h3>");
			}
		} else {
			out.println("<h3>Invalid EmployeeId or Password !!<h3>");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeLogin.html");
		dispatcher.include(request, response);

	}

}
