package com.techment.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class laptop
 */
@WebServlet("/laptop")
public class laptop extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		int price = 70000;
		
		int quantity = Integer.parseInt(request.getParameter("mobile"));
		pw.print("you have selected "+quantity);
		
		double totalPrice  = quantity*price;
		pw.print("Total price = "+totalPrice);
		
		String ttlPrice = String.valueOf(totalPrice);
		Cookie cookie = new Cookie("laptop-price",ttlPrice);
		response.addCookie(cookie);
		
		pw.print("<a href='cart'>go to cart</a>");
	}

}
