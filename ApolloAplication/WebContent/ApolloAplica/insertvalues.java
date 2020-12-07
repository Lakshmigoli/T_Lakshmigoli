package com.Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class insertvalues {
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
System.out.println("enter no of students:");
int num=sc.nextInt();
for(int i=0;i<num;i++)
{
System.out.println("enter id");
int id=sc.nextInt();
System.out.println("enter name");
String name=sc.next();
System.out.println("enter marks");
int marks=sc.nextInt();
System.out.println("enter section");
String section=sc.next();
String insert="insert into student values("+id+" ,'"+name+"',"+marks+",'"+section+"')";
int a=st.executeUpdate(insert);
if(a!=0)
	System.out.println("insert values");
	}
}
}





