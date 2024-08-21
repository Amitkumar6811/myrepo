package com.package1;

public class generic_method 
   {
    <T> void genericmethod(T a)
    {
    System.out.println(a);	
    System.out.println(a.getClass().getName()+":"+a);
    }
   public static void main(String[] args) 
   {
	generic_method obj=new generic_method();
	obj.genericmethod(123);
	obj.genericmethod("amit kumar");
	obj.genericmethod(true);
	obj.genericmethod(false);
	obj.genericmethod('a');
	
  }
   }
