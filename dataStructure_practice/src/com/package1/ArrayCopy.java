package com.package1;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayCopy
{
	 static void meth1()
     {
    	int arr[]= {1,3,2,5,7,5};
    	//copying array element to another arry (sallow copy)
    	//System.out.println("before copying the array \n"+Arrays.toString(arr));
    	//System.out.println("===================");
    	int arr1[]=Arrays.copyOf(arr, arr.length);
    	arr1[0]=0;
    	arr1[1]=0;
    	System.out.println("before copying the array");
    	 for(int data:arr)
  	   {
  		   System.out.print(data);
  	   }
    	 System.out.println();
      System.out.println("after copying the arry");
    	 for(int data1:arr1)
    	   {
    		   System.out.print(data1);
    	   }
    	 System.out.println();
     }
     
   static void meth2()
   {
	   Scanner scr=new Scanner(System.in);
	   System.out.println("enter the size of the array");
	   int n=scr.nextInt();
	   int arr[]=new int[n];
	   System.out.println("enter the "+n+" element in the array");
	   for(int i=0;i<n;i++)
	   {
		   arr[i]=scr.nextInt();
	   }
	   //reterive the element from array
	   System.out.println("before changing the element");
	   for(int data:arr)
	   {
		   System.out.print(data);
	   }
	   System.out.println("\n---------------------------");
	//changing the first and second element in the array
	   int arr1[]=arr;
	   arr[0]=0;
	   arr[1]=0;
	   System.out.println("after changing the element in array");
	   for(int data:arr)
	   {
		   System.out.print(data);
	   }
	 
   }
     public static void main(String[] args) 
     {
		ArrayCopy.meth1();
		
		ArrayCopy.meth2();
		
	}
     
     
  }