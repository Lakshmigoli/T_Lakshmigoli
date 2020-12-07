package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Like {
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
if(con!=null)
{
	System.out.println("connection established");
}
String subquery="select name from student where name like '-a%'";
ResultSet rs=st.executeQuery(subquery);
System.out.println("customer name using -x%");
while(rs.next()) {
	System.out.println(rs.getString(1));
}
@SuppressWarnings("unused")
String subquery1="select name from student where name like 'a%'";
rs=st.executeQuery(subquery);
System.out.println("customer name using x%");
while(rs.next()) {
	System.out.println(rs.getString(1));
}
@SuppressWarnings("unused")
String subquery2="select name from student where name like '%a'";
rs=st.executeQuery(subquery);
System.out.println("customer name using %x");
while(rs.next()) {
	System.out.println(rs.getString(2));
}
@SuppressWarnings("unused")
String subquery4="select name from student where name like '%a%'";
rs=st.executeQuery(subquery);
System.out.println("customer name using %x%");
while(rs.next()) {
	System.out.println(rs.getString(4));
}
}
}

