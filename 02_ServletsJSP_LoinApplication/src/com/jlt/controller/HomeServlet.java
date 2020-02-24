package com.jlt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jlt.pojo.EmployeeDetails;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession httpSession = request.getSession();
		EmployeeDetails details = (EmployeeDetails) httpSession.getAttribute("employee");

		PrintWriter out = response.getWriter();

		if (details != null) {
			out.println("<h3>Hello " + details.getName() + "</h3>");
			out.println("<a href=LogoutServlet>Logout</a>");

		}

	}

}
