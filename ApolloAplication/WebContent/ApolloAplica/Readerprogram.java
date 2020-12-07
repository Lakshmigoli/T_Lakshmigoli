package com.Files;

	import java.io.Reader;
	import java.io.FileReader;

	public class Readerprogram {
	    public static void main(String[] args) {
	    	int input=6;
	        char[] array = new char[100];

	        try {
	            Reader input1 = new FileReader("input.txt");
	            System.out.println("Is there data in the stream ? " + input1.ready());
	            input1.read(array);
	            System.out.println("Data in the stream:");
	            System.out.println(array);
	            input1.close();
	        }

	        catch(Exception e) {
	            e.getStackTrace();
	        }
	    }
	}

