package com.Exception;

import java.util.Scanner;

public class Exception3 {
	public static void main(String[] args) {
		try
		{
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("a="+a);
			System.out.println("enter a value b");
			int b=sc.nextInt();
			System.out.println("b="+b);
			int res=a/b;
			System.out.println("res="+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero");
			System.out.println("dont divide by zero");
		}
	}
}
