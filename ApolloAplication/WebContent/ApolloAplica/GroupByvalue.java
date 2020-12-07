package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class GroupByvalue {
	public static void main(String args[]) throws Exception
	{
	@SuppressWarnings({ "resource", "unused" })
	Scanner sc=new Scanner(System.in);
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/mysql";
String username="root";
String password="Root";
Connection con=DriverManager.getConnection (url,username,password);
Statement st=con.createStatement();
String groupby="select max(marks),section from student group by section";
ResultSet rs=st.executeQuery(groupby);
System.out.println("maximum  || section");
while(rs.next())
{
	System.out.println(rs.getInt(1)+"    ||       "+rs.getString(2));
}
}
}
