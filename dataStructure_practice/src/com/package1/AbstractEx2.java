package com.package1;

public abstract class AbstractEx2 
{
	abstract int meth1(int a);
	public abstract String meth1(String c);
	
   int meth1()
   {
	   System.out.println("parent meth1..");
	   return 0;
   }
   static void meth2()
   {
	 System.out.println("static method called..."); 
   }
   AbstractEx2()
   {
	   System.out.println("I am parent default constructor...");
   }
   AbstractEx2(int a)
   {
	   System.out.println("I am parent parameterize constructor..");
   }
  
}
