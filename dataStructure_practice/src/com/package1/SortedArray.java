package com.package1;

import java.util.Scanner;

public class SortedArray 
  {
   static boolean isSorted(int arr[])
   {
	   boolean check=true;
	   int n=arr.length;
	   for(int i=1;i<n;i++)
	   {
		  if(arr[i]<arr[i-1])
			  check=false;
	   } 
	   
	   if(check==true)
	   {
		   System.out.println("sorted array");
	   }
	   else
	   {
		 System.out.println("not sorted array");  
	   }
	   return check;
   }
   public static void main(String[] args)
   {
   	Scanner sc=new Scanner(System.in);
   	System.out.println("Enter the size of the array");
   	int n=sc.nextInt();
   	int arr[]=new int[n];
   	System.out.println("Enter "+n+" element in the array");
   	for(int i=0;i<n;i++)
   	{
   		arr[i]=sc.nextInt();
   	}
   	SortedArray.isSorted(arr);
   	//System.out.print(SortedArray.isSorted(arr));
   	sc.close();
	}
}

