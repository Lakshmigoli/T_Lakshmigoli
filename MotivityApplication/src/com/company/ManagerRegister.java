package com.company;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ManagerRegister extends HttpServlet {
Connection con=null;
PreparedStatement ps=null;
public void init(ServletConfig config) {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
}catch (ClassNotFoundException e) {
e.printStackTrace();}
String url="jdbc:mysql://localhost:3306/company";
String username="root";
String password="Root";
try {
con=DriverManager.getConnection(url,username,password);
} catch(SQLException e ) {
e.printStackTrace();}}
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
String name=request.getParameter("name");
String password=request.getParameter("password");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
long mobile=Long.parseLong(phone);
String designation=request.getParameter("designation");
String gender=request.getParameter("gender");
String experience=request.getParameter("experience");
PrintWriter pw=response.getWriter();
String sql="insert into manager(name,password,email,phone,designation,gender,experience) values(?,?,?,?,?,?,?)";
try {
ps=con.prepareStatement(sql);
ps.setString(1, name);
ps.setString(2, password);
ps.setString(3,email);
ps.setLong(4,mobile);
ps.setString(5, designation);
ps.setString(6, gender);
ps.setString(7, experience);
pw.println("<html> <body bgcolor='wheat'><center><h1>");
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("./manager_Login.html?msg=registered");
} catch(SQLException e) {
e.printStackTrace();}}}

