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
<table border="2" align="center" width="600" height="300" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Email</td><td>Phone</td><td>Specialisation</td><td>Action</td></tr>
<% 
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/kims";
String username="root";
String password="Root";
con=DriverManager.getConnection(url,username,password);
String email=(String)session.getAttribute("semail");
ps=con.prepareStatement("select * from doctor where email=?");
ps.setString(1,email);
ResultSet rs=ps.executeQuery();
while(rs.next()) {	
%>
<tr>

<td><%=rs.getInt("id") %></td>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getInt("phone") %></td>
<td><%=rs.getString("specialisation") %></td>
<td><a href="update_doctor_profile.jsp?id=<%=rs.getInt(1)%>">Update</a></td>
</tr>

<%}  %>
</table>
</body>
</html>
