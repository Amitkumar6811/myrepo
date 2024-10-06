package com.package1;

public class Recu1 
  {
    static void NaturalNum(int n)
     {
    	 if(n==1)
    	 {
    		 System.out.println(n);
    		 return;
    	 }
    	 NaturalNum(n-1);
    	 System.out.println(n);
     }
    static void ReverseNum(int n)
    {
    	if(n==1)
   	 {
   		 System.out.println(n);
   		 return;
   	 }
     System.out.println(n);
     ReverseNum(n-1);
   	 
    }
    public static void main(String[] args) 
    {
    	
		NaturalNum(5);
		System.out.println("==============");
		ReverseNum(5);
	}
  }
