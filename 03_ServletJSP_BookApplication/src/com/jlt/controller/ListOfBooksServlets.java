package com.jlt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ListOfBooksServlets")
public class ListOfBooksServlets extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in doGet of ListOfBooksServlets");
		Set<String> books;
		int i = 1;
		PrintWriter out = response.getWriter();

		out.println("<h3>List of Books</h3>");

		HttpSession session = request.getSession();
		if (session.getAttribute("booksList") != null) {
			out.println("<table border=1>");
			books = (Set<String>) session.getAttribute("booksList");
			System.out.println(books);
			for (String book : books) {
				out.println("<tr>");
				out.println("<td>");
				out.println(i);
				out.println("</td>");
				out.println("<td>");
				out.println(book);
				out.println("</td>");
				out.println("</tr>");
				i++;
			}
			out.println("</table>");
		} else {
			out.println("<h3>No books found !!</h3>");
		}
		out.print("<br>");
		out.print("<a href=Books.html>Add Books</a>");

	}

}
