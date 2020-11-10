package com.Files;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class ObjectStream {
public static void main(String args[])
{
	int data=4;
	String data1="this is program";
	try
	{
		FileOutputStream file=new FileOutputStream("file.txt");
		ObjectOutputStream output=new ObjectOutputStream(file);
	output.writeInt(data);
	output.writeObject(data1);
	FileInputStream filestream=new FileInputStream("file.txt");
	ObjectInputStream outputstream=new ObjectInputStream(filestream);
	System.out.println("integer data:"+outputstream.readInt());
	
System.out.println("String data:"+outputstream.readObject());
output.close();
outputstream.close();
}
	catch(Exception e)
	{
		e.getStackTrace();
	}
}
}
//Definition//
//objectStream support input and output of object.that means that all primitive data input and output methods coverd in data streams//