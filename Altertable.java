package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Altertable {
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
System.out.println("1.change column");
int choice=sc.nextInt();
if(choice==1)
{
	System.out.println("enter the oldcolumn")	;
	String oldcolname=sc.next();
	System.out.println("enter the newcolname:");
	String newcolname=sc.next();
	System.out.println("enter the datatype of new colname:");
	String datatype=sc.next();
	String alter="alter table student change"+oldcolname+" "+newcolname + " "+datatype;
int a=st.executeUpdate(alter);
if(a==0)
	System.out.println("altered");
}
	}
}
	
