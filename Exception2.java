package com.Exception;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[9];
try {
	a[10]=50;
}
catch(ArrayIndexOutOfBoundsException e)
{
	e.printStackTrace();
}
	}

}
