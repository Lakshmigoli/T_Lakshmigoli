package com.Exception;

public class Stringprogram {
public static void main(String args[])
{
	String s1="ja";
	System.out.println("s1="+s1);
	String s2=new String("va");
	System.out.println("s2="+s2);
	String s3="ja";
	System.out.println("s3="+s3);
	String s4="va";
	System.out.println("s4="+s4);
	System.out.println(s1==s3);
	System.out.println(s2==s4);
	String s5=s1+s4;
	System.out.println("s5="+s5);
	String s6="java";
	System.out.println("s6="+s6);
	System.out.println(s5==s6);
	
}
}
