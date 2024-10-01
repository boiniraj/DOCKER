package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/home")
public class WishMessages extends HttpServlet {
	
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
{
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	pw.println("<h1>Good morning</h1>");
     pw.println("<a href='index.html'>Home</a>");

}
}
