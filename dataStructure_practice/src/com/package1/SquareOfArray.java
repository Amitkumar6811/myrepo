package com.package1;

import java.util.Scanner;

// -10,-3,-2,1,4,5

public class SquareOfArray 
	{
	   static void squareofarray(int arr[])
	   {
		   int n=arr.length;
		   int arr1[]=new int[n];
		   int index=0;
		   int left=0;
		   int right=n-1;
		   
		   while(left<=right)
		   {
			   if(Math.abs(arr[left]) >  Math.abs(arr[right]))
			   {
				  arr1[index++]=arr[left]*arr[left];
				  left++;
			   }
			   else
			   {
				   arr1[index++]=arr[right]*arr[right];
				   right--;
			   }
		   }
		   reverse(arr1);
		   Arrayprint(arr1);
	   }
	   
	   // swap method
	   static void swap(int arr[],int i,int j)
	    {
	 	      int temp=arr[i];
	 	        arr[i]=arr[j];
	 	        arr[j]=temp;
	    }
	  
	  // reverse method
	  
	  static void reverse(int arr[])
	  {
		  int i=0;
		  int j=arr.length-1;
		  while(i<j)
		  {
			 swap(arr,i,j);
			 j++;
			 j--;
		  }
	  } 
	  
//	   static void reverse1(int arr[])
//	   {
//		   int n=arr.length;
//		   int arr1[]=new int[n];
//		   int j=0;
//		   for(int i=n-1;i>=0;i--)
//		   {
//			   arr1[j++]=arr[i];
//		   }
//		  
//	   }
	    
	  static void Arrayprint(int arr[])
	    {
		  SquareOfArray.reverse(arr);
	    	for(int data:arr)
	    	{
	    		System.out.print(data);
	    	}
	    }
	  // main method 
	  
	   public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the size of the array");
	    	int n=sc.nextInt();
	    	int arr[]=new int[n];
	    	System.out.print("Enter "+n+" element in the array");
	    	System.out.println();
	    	for(int i=0;i<n;i++)
	    	{
	    		arr[i]=sc.nextInt();
	    	}
	    	SquareOfArray.squareofarray(arr);
	    	sc.close();
		}
	}

