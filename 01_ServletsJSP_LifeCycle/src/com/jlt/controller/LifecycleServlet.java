package com.jlt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifecycleServlet extends HttpServlet {

	public LifecycleServlet() {
		System.out.println("Servlet Object Is Created !!");
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init Method Called !!");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hello World !!");
		System.out.println("Service Method Called !!");
	}

	public void destroy() {
		System.out.println("Destroy Method Called !!");
	}

}
