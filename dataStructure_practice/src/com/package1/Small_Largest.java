package com.package1;

import java.util.Arrays;
import java.util.Scanner;

public class Small_Largest 
    {
     static int[] SmallestLargest(int arr1[])
     {
    	 Arrays.sort(arr1);
    	 int[] ans= {arr1[0],arr1[arr1.length-1]};
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
     	int[] result=Small_Largest.SmallestLargest(arr);
     	System.out.print(Arrays.toString(result));
        sc.close();
  	}
  }
