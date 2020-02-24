package com.jlt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculationsServlet
 */
public class CalculationsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		double num1 = Double.valueOf(request.getParameter("txtNumOne"));
		double num2 = Double.valueOf(request.getParameter("txtNumTwo"));
		String option = request.getParameter("option");

		PrintWriter out = response.getWriter();

		switch (option) {
		case "+":
			out.println("Addition of " + num1 + " and " + num2 + " is  " + (num1 + num2));
			break;
		case "-":
			out.println("Subtraction of " + num1 + " and " + num2 + " is  " + (num1 - num2));
			break;
		case "*":
			out.println("Multiplication of " + num1 + " and " + num2 + " is  " + (num1 * num2));
			break;
		case "/":
			out.println("Division of " + num1 + " and " + num2 + " is  " + (num1 / num2));
			break;
		}
	}

}
