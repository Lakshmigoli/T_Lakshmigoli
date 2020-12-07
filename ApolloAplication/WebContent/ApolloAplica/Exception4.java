package com.Exception;

public class Exception4 {
	public static void main(String args[])
	{
		String s="abc";
		int i=Integer.parseInt(s);
		try
		{
			System.out.print(i);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
	}

}
