package com.Exception;
import com.Exception.mobileusingEqualsmethod;
public class equalsmethod {
public static void main(String args[])
{
	mobileusingEqualsmethod m1=new mobileusingEqualsmethod(1234,"Mi",6);
	mobileusingEqualsmethod m2=new mobileusingEqualsmethod(5678,"mi",6);
	System.out.println(m1==m2);
	System.out.println(m1.equals(m2));
	System.out.println(m1);
	System.out.println(m2);
	
}
}
