package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeRegisterBean {
	private String name,gender,email,password,designation;
	private int salary,no_of_leaves_taken,number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getphone() {
		return number;
	}
	public void setphone(int number) {
		this.number=number;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getsalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getno_of_leaves_taken() {
		return no_of_leaves_taken;
	}
	public void setno_of_leaves_taken(int no_of_leaves_taken) {
		this.no_of_leaves_taken = no_of_leaves_taken;
	}
	
	
	public boolean registrationValidate(String name,String password,int number,String designation,int salary,int no_of_leaves_taken) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Conectivity();
		PreparedStatement ps=con.prepareStatement("insert into employee(name,password,email,number,designation,salary,no_of_leaves_taken) values(?,?,?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setInt(4, number);
		ps.setString(5, designation);
		ps.setInt(6, salary);
		ps.setInt(7,no_of_leaves_taken);
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}
	public boolean registrationValidate(String name2, String password2, String email2, int number2, String designation2,
			String gender2, int experience2) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}