package com.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistcollection {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(new Holiday(1,"new year"));
	al.add(new Bike(123,"java",150));
	al.add(new Holiday(15,"sankranthi"));
	al.add(new Bike(125,"lava",140));
	al.add(new String("java is easy"));
	al.add(null);
	System.out.println(al.size());
	Iterator il=al.iterator();
	while(il.hasNext()) {
		Object ob=il.next();
		System.out.println(ob);
	}
	}
	
	
	
	

	

}
