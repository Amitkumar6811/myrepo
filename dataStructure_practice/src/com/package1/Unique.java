package com.package1;

import java.util.ArrayList;
import java.util.Scanner;

public class Unique 
	{
	   static int firstuniqueNo(int arr[])
	   {
		   ArrayList<Integer> List=new ArrayList<>();
		   int n=arr.length;
		   int uniq=-1;
		   for(int i=0;i<n;i++)
		   {
			 for(int j=i+1;j<n;j++)
			 {
				 if(arr[i]==arr[j])
				 {
					 arr[i]=-1;
					 arr[j]=-1;
				 }
			 }
		   }
		   for(int i=0;i<n;i++)
		   {
			   if(arr[i]!=-1)
			   {
				   List.add(arr[i]);
				   uniq=arr[i];
			   }
		   }
		   System.out.println(List);
		   return uniq;
	   }
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
	    	
	    	System.out.println("unique number is: ");
	    	System.out.print(Unique.firstuniqueNo(arr1));
	    	sc.close();
		}
	}


