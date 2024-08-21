package com.package1;

public class varargsDemo3 
 {
     static void varargsmeth(Object...ob)
     {
    	 System.out.println("no of argument "+ob.length+" Elements");
    	 for(Object o : ob)
    	 System.out.println(" "+o);
     }
     public static void main(String[] args) 
     {
		varargsmeth(123,"afa",'s',23.4,true);
		varargsmeth("afa",'s',23.4);
		varargsmeth(123,"afa",23.4,false);
		
	}
  }
