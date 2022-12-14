package com.yash.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Employee_Connection {
	
	Connection con;
	
	
	public Employee_Connection( ) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Yash_Db","root","root");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		
		}
		
		
	}


	public Connection getCon() {
		return con;
	}
	

}
