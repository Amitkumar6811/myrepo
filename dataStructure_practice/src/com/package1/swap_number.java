package com.package1;

public class swap_number 
   {
    public static <T> void swap(T a,T b)
     {
    	 T temp;
    	 temp=a;
    	 a=b;
    	 b=temp;
    	 System.out.println(a);
 	     System.out.println(b);
 	    
     }
    public static void main(String[] args) 
    {
		Double a=new Double(10);
		Double b=new Double(20);
		swap(a,b);
		
//		String a="afs";
//		String b="a";
//		swap(a,b);
	 
		
	}
   }
