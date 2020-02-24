package com.jlt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultiplicationTableServlet
 */
public class MultiplicationTableServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int number = Integer.valueOf(request.getParameter("txtNumber"));

		PrintWriter out = response.getWriter();
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<td>");
		out.println("Number");
		out.println("</td>");
		out.println("<td>");
		out.println(" i ");
		out.println("</td>");
		out.println("<td>");
		out.println("Number");
		out.println("</td>");
		out.println("</tr>");
		
		for (int i = 1; i <= 10; i++) {
			out.println("<tr>");
			out.println("<td>");
			out.println(number);
			out.println("</td>");

			out.println("<td>");
			out.println(i);
			out.println("</td>");

			out.println("<td>");
			out.println(number * i);
			out.println("</td>");

			out.println("</tr>");
		}
	
		out.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
