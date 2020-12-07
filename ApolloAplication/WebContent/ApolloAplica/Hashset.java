package com.Hashset;
import com.Arraylist.BikeHashset;
public class Hashset {
	public static void main(String[] args) {
		Hashset hs=new Hashset();
		BikeHashset  b1=new BikeHashset (12,"ktm",200);
		BikeHashset  b11=new BikeHashset (12,"ktm",200);
		hs.add(b1);
		hs.add(b11);
		hs.add(new BikeHashset (12,"Hero",150));
		hs.add(new BikeHashset (13,"Hand",160));
		{
for(Object ob:hs)
{
	System.out.println(ob);
}
			
		}
		
	}
	

	private void add(BikeHashset  b1) {
		// TODO Auto-generated method stub
		
	}
}


