package com.itgiga;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		// TODO Auto-generated method stub
		Connection con=DBConnection.createConnection();
		
		PrintWriter p=response.getWriter();
    	String id=request.getParameter("id");
    	p.println(id);
    	String name=request.getParameter("name");
    	String desg = request.getParameter("desg");
    	String sal = request.getParameter("sal");
		p.print(sal);
	}
}
		 
   