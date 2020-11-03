package com.Hashmap;

import java.util.Iterator;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



@SuppressWarnings("rawtypes")
public class MapDemo {
	private static final TreeMap<Integer, String> tm = null;
	public static void main(String args[]) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1234,"lucky");
			tm.put(1235,"siri");
			tm.put(1236,"surya");
			tm.put(1238,"suresh");
			tm.put(1239,"msn");
			tm.put(1234,"lucky");
			System.out.println(tm);
		}
		Set s=tm.entrySet();
		Iterator i=s.iterator();{
		while(i.hasNext()) {
			Map.Entry m=(Map.Entry)i.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}

