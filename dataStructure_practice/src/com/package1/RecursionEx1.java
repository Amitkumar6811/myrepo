package com.package1;

public class RecursionEx1 
  {         
    static int fact(int n)
    {
    	// base case
    	 if(n==0) 
    		 return n; 
    	 
    	// subproblem 
    	 	 
    	return n*fact(n-1);
    }
    public static void main(String[] args)
    {
    	System.out.println(RecursionEx1.fact(5));
	}
  }
