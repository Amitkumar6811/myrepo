package com.package1;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array 
	{
	 static int[] reverse(int[] arr)
	 {
		 int n=arr.length;
		 int arr1[]=new int[n];
		 int j=0;
		 for(int i=n-1;i>=0;i--)
		 {
			 arr1[j++]=arr[i];
			 
		 }
		 return arr1;
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
	    	//int result[]=Reverse_Array.reverse(arr);
	    	System.out.println("reverse array...");
	    	System.out.println(Arrays.toString(Reverse_Array.reverse(arr)));
	    	sc.close();
		}
	}
