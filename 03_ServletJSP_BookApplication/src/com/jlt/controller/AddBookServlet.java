package com.jlt.controller;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Set<String> books;
		String bookName = request.getParameter("txtBookName");

		HttpSession session = request.getSession();
		
		if (session.getAttribute("booksList") == null) {
			books = new TreeSet<String>();
			books.add(bookName);
			System.out.println(books);
			session.setAttribute("booksList", books);
		} else {
			books = (Set<String>) session.getAttribute("booksList");
			books.add(bookName);
			System.out.println(books);
			session.setAttribute("booksList", books);
		}

		response.sendRedirect("ListOfBooksServlets");
	}

}
