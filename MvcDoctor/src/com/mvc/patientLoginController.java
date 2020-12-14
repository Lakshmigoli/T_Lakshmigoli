package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PatientLoginController")
public class patientLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		String password=request.getParameter("password");
		
		patientLoginBean plb=new patientLoginBean();
		plb.setId(id);
		plb.setPassword(password);
		
		HttpSession hs=request.getSession();
		hs.setAttribute("id", id);
		patientRegistationBean prb=null;
		
		try {
			prb=plb.loginValidate(id, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(prb!=null){
			hs.setAttribute("parbean", prb);
			response.sendRedirect("patientprofile.jsp?msg=logged_in_Successfully");
		}
		else
			response.sendRedirect("./PatientLogin.html");
	}

}
