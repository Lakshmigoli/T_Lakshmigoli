<!DOCTYPE html>
<html>
<body bgcolor="yellow">
<br><br><br>
<center><h1> WELCOME TO DOCTOR HOME</h1></center>
<br><br><br>
<a href=doctor_home.html">Home</a>
<a href=doctor_profile.jsp">profile</a>
<a href="view_appointment.jsp">Appointment Details</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@page import ="com.mvc.LoginBean" %>
<% 
LoginBean lb=(LoginBean)session.getAttribute("bean");

%>
<%=lb.getEmail() %>

</body>
</html>