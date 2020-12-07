package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Deletevalue {
	public static void main(String args[]) throws Exception
	{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/mysql";
String username="root";
String password="Root";
Connection con=DriverManager.getConnection (url,username,password);
Statement st=con.createStatement();
System.out.println("delete for student value");
System.out.println("enter your id");
int id=sc.nextInt();
String delete="delete from student where sid="+id;
int a=st.executeUpdate(delete);
if(a!=0)
	System.out.println("deleted");	
}
}

