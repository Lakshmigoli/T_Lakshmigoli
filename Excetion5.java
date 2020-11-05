package com.Exception;

public class Excetion5 {
public static void main(String args[])
{
	try
	{
		System.out.println("1");
		@SuppressWarnings("unused")
		int sum=9/0;
		System.out.println("2");
	}
	catch(ArithmeticException e)
	{
		System.out.println("4");
	}
	finally
	{
		System.out.println("5");
	}
}
}

