package com.Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Joinvalues {
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
String subquery="select p.personid,p.Firstname,p.Lastname,a.personid from person p join orders o where p.id=a.cid";
ResultSet rs=st.executeQuery(subquery);
System.out.println("Id   ||  person    ||  adress");
while(rs.next()) {
	System.out.println(rs.getInt(1)+"    ||       "+rs.getString(2));
	}
	}
	}




