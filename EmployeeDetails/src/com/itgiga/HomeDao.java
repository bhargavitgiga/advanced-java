package com.itgiga;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HomeDao {

	public static  String registerUser(HomeBean h)
	 {
	 String id = h.getId();
	 String name =h.getName();
	 String desg = h.getDesg();
	 String sal = h.getSal();
	 Connection con=null;
	//PreparedStatement p = null;
	
	
	 try
	 {
	  con = DBConnection.createConnection();
	  String query = "insert into user(id,name,desg,sal) values (?,?,?,?)"; 
     PreparedStatement p1=con.prepareStatement(query); 
      p1.setString(1,id);
      p1.setString(2,name);
	   p1.setString(3,desg);
	   p1.setString(4,sal);
	  
	 p1.executeUpdate();
	  
	 //if (i!=0)  //Just to ensure data has been inserted into the database
	
	 
	 }
	 catch(SQLException e)
	 {
	 e.printStackTrace();
	 }
	 return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
	 }
	}


