package com.Arraylist;
import com.Arraylist.Holiday;
public class LinkedListDemo {
	private int size;

	public static void main(String args[])
	{
		LinkedListDemo al=new LinkedListDemo();
		al.add(new Holiday(5,"sankaranthi"));
		al.String(new String("testing is easy"));
		for(int i=0;i<al.size;i++)
		{
			Object ob=al.get(i);
			System.out.println(ob);
			
		}
	}

	private Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private void String(String string) {
		// TODO Auto-generated method stub
		
	}

	private void add(Holiday holiday) {
		// TODO Auto-generated method stub
		
	}

}
