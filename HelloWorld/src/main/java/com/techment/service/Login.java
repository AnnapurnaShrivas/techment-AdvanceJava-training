package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Userlogin")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Hello servlet called");
		
		PrintWriter out = response.getWriter();
		out.print("hello this is my first servlet<br><br>");
		
		String name = request.getParameter("u");
		String pass = request.getParameter("p");
		
		int nameLenght = name.length();
		
		System.out.println("Your name is = "+name+" size is = "+nameLenght);
		
		out.print("Your name is = "+name+"<br><br> size is = "+nameLenght);
		
	}

}
