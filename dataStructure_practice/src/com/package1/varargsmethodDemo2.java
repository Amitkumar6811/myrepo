package com.package1;

public class varargsmethodDemo2 
  {
    static void varargs(int ... v)
    {
    	System.out.println("no. of arguments "+v.length+" Elements");
    	for(int data:v)
    		System.out.println(data);
    }
    public static void main(String[] args) 
    {
		varargs(9);
		varargs(9,3,2,4);
		varargs();
		
	}
  }
