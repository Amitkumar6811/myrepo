package com.package1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreEx 
   {
   void operation1() throws Exception
   {
	   System.out.println("Implementing data stream...");
	   DataOutputStream dos=new DataOutputStream(new FileOutputStream("D:\\amit kumar\\file\\file1.txt"));
	   System.out.println("please wait...");
	   Thread.sleep(1000);
	   System.out.println("Connection created...");
	   dos.writeInt(1000);
	   dos.writeChar('A');
	   dos.writeBoolean(true);
	   dos.writeUTF("I lave India");
	   dos.close();
   }
   void operation2() throws Exception
   {
	   System.out.println("Implementing data stream...");
	   DataInputStream dis=new DataInputStream(new FileInputStream("D:\\amit kumar\\file\\file1.txt"));
	   System.out.println("please wait...");
	   Thread.sleep(1000);
	   System.out.println("Connection created...");
	   System.out.println(dis.readInt());
	   System.out.println(dis.readChar());
	   System.out.println(dis.readBoolean());
	   System.out.println(dis.readUTF(dis));
	   dis.close();
   }
   public static void main(String[] args) throws Exception
   {
//	  new DataStreEx().operation1();
//	  new DataStreEx().operation2(); 
	  try
	  {
		  new DataStreEx().operation1();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
   }
  }
