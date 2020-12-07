package com.Files;
	import java.io.FileWriter;
	import java.io.BufferedWriter;

	public class Bufferedwriterprogram {
	  public static void main(String[] args) {

	    String data = "This is a demo of the flush method";

	    try {
	      // Creates a FileWriter
	      FileWriter file = new FileWriter(" flush.txt");

	      // Creates a BufferedWriter
	      BufferedWriter output = new BufferedWriter(file);

	      // Writes data to the file
	      output.write(data);

	      // Flushes data to the destination
	      output.flush();
	      System.out.println("Data is flushed to the file.");

	      output.close();
	    }

	    catch(Exception e) {
	      e.getStackTrace();
	    }
	  }
	}
	

