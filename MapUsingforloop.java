package com.Hashmap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapUsingforloop {
	public static void main(String args[]) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1234,"lucky");
			tm.put(1235,"siri");
			tm.put(1236,"surya");
			tm.put(1238,"suresh");
			tm.put(1239,"msn");
			tm.put(1234,"lucky");
			System.out.println(tm);
	
	Set<Map.Entry<Integer,String>> s=tm.entrySet();
	for(Map.Entry<Integer,String> x:s) {
		System.out.println(x.getKey()+"  "+x.getValue());
	}
	
	}

	
}
