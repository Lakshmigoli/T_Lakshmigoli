<!DOCTYPE html>
<html>
<body bgcolor="powderblue">
<br><br><br>
<center><h1>WELCOME TO DOCTOR HOME</h1></center>
<br><br><br>
<a href="doctor_home.html">Home</a> |
<a href="doctor_profile.jsp">Profile</a> |
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="java.sql.*" %> 
<% 
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/kims";
String username="root";
String password="Root";
con=DriverManager.getConnection(url,username,password);
int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String email=request.getParameter("email");
Long phone=Long.parseLong(request.getParameter("phone"));
String specialisation=request.getParameter("specialisation");
ps=con.prepareStatement("update doctor set name=?,email=?,phone=?,specialisation=? where id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setLong(3,phone);
ps.setString(4,specialisation);
ps.setInt(5,id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("doctor_profile.jsp?msg=Updated");
%>
