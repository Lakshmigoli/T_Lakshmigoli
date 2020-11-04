package com.control;

public class nestedifprogram {
	public static void main(String args[])
	{
		int correctpin=1234;
		int storedpin=1234;
		if(correctpin==storedpin)
		{
			double balance=5000.00;
			double amt=2000.00;
			if(balance>=amt)
			{
				System.out.println("take money and leave");
			}
			else
			{
				System.out.println("go and check correct pin no");
			}
		}
		else
		{
			System.out.println("recheck the correct pin");
		}

}
}
