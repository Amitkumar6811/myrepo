package com.package1;

import java.util.ArrayList;
import java.util.Scanner;

public class PairSum 
   {
     static int pairSum(int arr1[],int k)
     {
    	 ArrayList<Integer> List=new ArrayList<>();
    	 int n=arr1.length;
    	 int ans=0;
    	 for(int i=0;i<n;i++)
    	 {
    		 for(int j=i+1;j<n;j++)
    		 {
    			 if(arr1[i]+arr1[j]==k)
    			 {
    				List.add(arr1[i]);
    				List.add(arr1[j]);
    				ans++;
    			 }
    		 }
    	 }
    	 System.out.println(List);
    	 return ans;
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
     	System.out.println("Enter target element");
     	int n1=sc.nextInt();
     	System.out.println("number of count");
     	System.out.print(PairSum.pairSum(arr,n1));
     	sc.close();
     	//1,5,2,3,4,8,9,10
     	
 	}
   }
