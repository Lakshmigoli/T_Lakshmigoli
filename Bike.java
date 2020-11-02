package com.Arraylist;

public class Bike {
int idno;
String brand;
double milage;
public Bike(int idno,String brand,double milage)
{
	super();
	this.idno=idno;
	this.brand=brand;
	this.milage=milage;
}
@Override
public String toString() {
return "Bike[idno="+idno+",brand="+brand+",milage="+milage+"]";
}
}
	

	


