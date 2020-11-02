package com.Arraylist;

public class BikeHashset {
	int idno;
	String brand;
	double milage;
	public BikeHashset (int idno,String brand,double milage)
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
	public int hashcode()
	{
		return idno;
	}
	public boolean equals(Object ob)
	{
		Bike bt=(Bike)ob;
		return this. idno=bt.idno;
	}
	}
		

