package com.itgiga;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection createConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/bhargav";
		String username = "root";
		String password = "1992";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(url, username, password);
			System.out.println("connected");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}

