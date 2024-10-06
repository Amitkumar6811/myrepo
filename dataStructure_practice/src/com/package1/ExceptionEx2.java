package com.package1;
import java.io.FileInputStream;

public class ExceptionEx2 
  {
     int avl_amt=10000;
     
     void meth1(int wd_amt)
     {
    	 if(avl_amt<wd_amt)
    	 {
    		 throw new NullPointerException("Insufficient funds");
    	 }
    	 else
    	 {
    		 System.out.println("Transaction success...");
    	 }
     }
     
     void meth2() throws Exception
     {
    	 System.out.println("-----method-----");
    	 FileInputStream fis=new FileInputStream("D:\\amit kumar\\file\\A.txt");
    	 System.out.println("Connection created...");
     }
     
     public static void main(String[] args) throws Exception
     {
    	 ExceptionEx2 obj=new ExceptionEx2();
    	 obj.meth2();
    	 obj.meth1(233555);
	}
  }
