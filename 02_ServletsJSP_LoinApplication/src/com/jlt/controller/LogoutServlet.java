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

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession httpSession = request.getSession();
		httpSession.invalidate();

		PrintWriter out = response.getWriter();
		out.println("<h3>Logged Out Successfull !!<h3>");

		RequestDispatcher dispatcher = request.getRequestDispatcher("EmployeeLogin.html");
		dispatcher.include(request, response);
	}

}
