package com.mvc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {
	public static Connection Conectivity() throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/kims";
		String username="root";
		String password="Root";
		 Connection con=DriverManager.getConnection(url,username,password);
		return con;
	}

}
