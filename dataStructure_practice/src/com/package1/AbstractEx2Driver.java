package com.package1;

public class AbstractEx2Driver extends AbstractEx2
   {
	public int meth1(int a)
      {
    	 System.out.println("meth1 overriding "+a);
    	 return a;
      }
     public String meth1(String s)
     {
    	 
    	 System.out.println("String method overriding");
    	return s; 
     }
     AbstractEx2Driver()
     {
    	 super();
    	 System.out.println("default constructor..");
     }
     AbstractEx2Driver(int a)
     {
    	super(10);
    	System.out.println("parameter child ");
     }
     public static void main(String[] args) 
     {
    	 AbstractEx2 aobj =new AbstractEx2Driver(20);
    	 aobj.meth1(3);
    	 aobj.meth1("amit");
    	 meth2();
    	 aobj.meth1();
	 }
     
   }
