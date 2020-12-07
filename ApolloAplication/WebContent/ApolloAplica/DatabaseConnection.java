package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/mysql";
String username="root";
String password="Root";
Connection con=DriverManager.getConnection (url,username,password);
if(con!=null)
{
	System.out.println("connection established");
}
}
}
