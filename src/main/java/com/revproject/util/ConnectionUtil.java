package com.revproject.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	//making this connection a singleton to be returned to any method querying the 
	//database. Reusing the same object
	private static Connection con;
	
	//Method returns a connection if it exists, otherwise creates a connection with the db
	public static Connection getConnection() throws SQLException {
		
		String url = "jdbc:postgresql://database-1.cppqqpgqqq5o.us-east-1.rds.amazonaws.com:5432/postgres";
		String username = "postgres";
		String password = "Linux1134";
		
		if(con == null || con.isClosed()) {
			con = DriverManager.getConnection(url, username, password);
		}
		return con;
		
	}
}
