package com.Exception;

public class mobileusingEqualsmethod {
int imei;
String brand;
int ram;
public mobileusingEqualsmethod(int imei,String brand,int ram)
{
this.imei=imei;
this.brand=brand;
this.ram=ram;
}
public boolean equals(Object ob)
{
	mobileusingEqualsmethod mt=(mobileusingEqualsmethod) ob;
	return this.imei==mt.imei;
}
public String toString()
{
	return imei+" "+brand+ " "+ram;
}
}


