package com.Hashset;

import java.util.HashMap;

public class Mapdemo {
	public static void main(String args[])
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1234,"lucky");
		hm.put(1235,"siri");
		hm.put(1236,"surya");
		hm.put(1238,"suresh");
		hm.put(1239,"msn");
		hm.put(1234,"lucky");
		System.out.println(hm);
	}
}
