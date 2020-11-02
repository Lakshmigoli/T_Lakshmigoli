package com.jnit;
class Sample<E>
{ 
void show(E a) {
	System.out.println(a);
}
}
public class GenericDemo {

	public static void main(String[] args) {
	Sample<Integer> s=new Sample<Integer>();
	s.show(100);
	Sample<String> p=new Sample<String>();
	p.show("lakshmi");
	Sample<Double> v=new Sample<Double>();
	v.show(23.0);

	}
	

}
