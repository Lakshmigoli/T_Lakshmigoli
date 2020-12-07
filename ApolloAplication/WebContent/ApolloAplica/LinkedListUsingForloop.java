package com.Hashmap;

import java.util.LinkedList;

public class LinkedListUsingForloop {
	public static void main(String args[]) {
}
	LinkedList<Integer> l1=new LinkedList<Integer>();
	{
		l1.add(34);
		l1.add(67);
		l1.add(57);
		l1.add(67);
		l1.add(56);
		l1.add(59);
		l1.add(69);
		System.out.println(l1);
		for(int i=0;i<l1.size();i++) {
			for(int j=i+1;j<l1.size();j++) {
				if(l1.get(i)==l1.get(j))
			{
				System.out.println(l1.get(i));
		}
			}
		
	}
	}
}
			

		

