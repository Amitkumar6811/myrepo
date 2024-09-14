package com.package1;

import java.util.Arrays;
import java.util.Scanner;

//prefix sum 
//arr=     [1,2,3,4,5]
//index     0 1 2 3 4
//ans=     [1,3,6,] 
public class PrefixSum 
   {
	
	// first way 
     static int[] prefix(int arr[])
     {
    	 int n=arr.length;
    	 int[] pref=new int[n];
    	 pref[0]=arr[0];
    	 for(int i=1;i<n;i++)
    	 {
    		 pref[i]=pref[i-1]+arr[i];
    	 }
    	 return pref; 
     }
     // Another method optimize way 
     static int[] prefix1(int arr[])
     {
    	  int n=arr.length;
    	  for(int i=1;i<n;i++)
    	  {
    		  arr[i]=arr[i-1]+arr[i];
    	  }
    	  return arr;
     }
    // printing array method 
     
     static void PrintArray(int arr[])
     {
    	 for(int data:arr)
    	 {
    		 System.out.println(data);
    	 }
     }
     
     //Range element add 
     
    static void meth1(int arr[],int q)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter range...");
    	while(q>0)
    	{
    		int l=sc.nextInt();
    		int r=sc.nextInt();
    		
    		int ans=arr[r]-arr[l-1];
    		System.out.println("ans=====> "+ans);
    	}
    }
     // main methood
     
     public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the size of the array");
	    	int n=sc.nextInt();
	    	int arr1[]=new int[n];
	    	System.out.println("Enter "+n+" element in the array");
	    	for(int i=0;i<n;i++)
	    	{
	    		arr1[i]=sc.nextInt();
	    	}
	    	System.out.println(Arrays.toString(PrefixSum .prefix1(arr1)));
	    	//PrefixSum.PrintArray(arr1);
	    	System.out.println("enter number of query...");
	    	int q=sc.nextInt();
	    	PrefixSum.meth1(arr1, q);
	    	sc.close();
		}
   }
