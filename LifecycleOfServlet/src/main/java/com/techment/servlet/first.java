package com.techment.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class first
 */
@WebServlet("/first")
public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	public first()
	{
		System.out.println("First constructor");
	}

	
	
	public void init(ServletConfig config) throws ServletException {
	 
		System.out.println("init() is called");
	}

	public void destroy() {
	
		System.out.println("destroy() is called");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("service() is called");
		
		PrintWriter out = response.getWriter();
		out.print("this is service");
		
	}

}
