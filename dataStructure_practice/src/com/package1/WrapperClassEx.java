package com.package1;

import java.util.ArrayList;
import java.util.Collections;

public class WrapperClassEx 
 {
	static void reverseList(ArrayList<Integer> list)
	{
		int i=0;
		int j=list.size()-1;
		while(i<j)
		{
	     /* int temp=i;
			i=j;
			j=temp;
			i++;
			j--;
			*/
		Integer temp=Integer.valueOf(list.get(i));
		list.set(i, list.get(j));
		list.set(j, temp);
		i++;
		j--;
		}
	}
	
	
   public static void main(String[] args) 
   {
	 //Wrapper classes
//	   Integer i=Integer.valueOf(10);
//	   Float f=Float.valueOf(054f);
//	   Double d=Double.valueOf(23.23);
//	   Long l=Long.valueOf(23428l);
//	   //Char c=Char.valueOf((char)'A');
//	   Short s=Short.valueOf((short) 23);
//	   System.out.println("class object: "+i);
	   
	   //ArrayList 
	   
	   ArrayList<Integer>al=new ArrayList<>();
	   al.add(10);
	   al.add(5);
	   al.add(2);
	   al.add(4);
	   
	   //printing element directly
	   
	   System.out.println(al);
	   
	   //print value with for loop
	   for(int i=0;i<al.size();i++)
	   {
		   System.out.print(al.get(i)+" ");
	   }
	  System.out.println();
	  // Adding element some index
	   
	  al.add(1,100);
	  al.add(al.size(),20);
	  System.out.println(al);
	  
	  //modify element at some index
	  
	  al.set(2, -1);
	  System.out.println(al);
	  
	  //Removing element at specified index
	  
	  al.remove(2);
	  System.out.println(al);
	  
	  //sorting the ArrayList
	  
	  Collections.sort(al);
	  System.out.println(al);
	  
	  //reverse array
	  Collections.reverse(al);
	  System.out.println(al);
	  
	  //check element present or not
	  
	  boolean ans=al.contains(Integer.valueOf(100));
	  boolean ans1=al.contains(500);
	  System.out.println(ans);
	  System.out.println(ans1);
	  
	  WrapperClassEx.reverseList(al);
	  System.out.println(al);
  }
 }
