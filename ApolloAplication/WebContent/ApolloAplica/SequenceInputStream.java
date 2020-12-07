package com.Files;

import java.io.FileInputStream;
import java.io.IOException;

public class SequenceInputStream {
	

	@SuppressWarnings("unused")
	private static final String fileinputstream1 = null;
	@SuppressWarnings("unused")
	private static final String fileinputstream2 = null;
	@SuppressWarnings("unused")
	private static final String SequenceinputStream = null;
	public SequenceInputStream(FileInputStream fileinputstream1, FileInputStream fileinputstream2) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) throws IOException
	{
		FileInputStream fileinputstream1=null;
		FileInputStream fileinputstream2=null;
		SequenceInputStream sequenceinputstream=null;
		try
		{
			fileinputstream1= new FileInputStream("myfile1.txt");
			fileinputstream2 =new FileInputStream("myfile2.txt");
			sequenceinputstream=new SequenceInputStream(fileinputstream1,fileinputstream2);
		boolean i;
		
		while(i=sequenceinputstream.read()!=-1) 
		System.out.println(i);
		}
		
		
	
	finally
	{
		if(fileinputstream1!=null)
		{
		fileinputstream1.close();
		}
		if(fileinputstream2!=null)
		{
			fileinputstream2.close();
		}
		if(sequenceinputstream!=null)
		{
			sequenceinputstream.close();
		}
		
			
	}
	}
		
	

	
	private int read() {
		// TODO Auto-generated method stub
		return 0;
	}

	private void close() {
		// TODO Auto-generated method stub
		
	}

}