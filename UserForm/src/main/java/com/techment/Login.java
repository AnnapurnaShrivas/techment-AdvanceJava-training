package com.techment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/registeruser?autoReconnect=true&useSSL=false", "root", "Annapurna@1998"); 
			
			
			System.out.println("Connected");
			
			String n= request.getParameter("username");
			
			Statement stm = con.createStatement();
			
			PreparedStatement ps= con.prepareStatement("select * from registeruser where name=?");
			ps.setString(1, n);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				out.print("Login Successfull....");
				String name = rs.getString(1);
				String password = rs.getString(2);
				String email = rs.getString(3);
				String country = rs.getString(4);
				
				out.println("Username = "+name+"<br>");
				out.println("Password = "+password+"<br>");
				out.println("Email Id = "+email+"<br>");
				out.println("Country = "+country+"<br>");
				
			}
			else
				{
				out.print("Wrong UserId or Password<br><hr>");
				
				out.print("New Registration <a href='Register.html'>New Registration</a>");
				}
				}
			
	
		catch (Exception e2) {System.out.println(e2);}  
        
		out.close(); 
	}

}
