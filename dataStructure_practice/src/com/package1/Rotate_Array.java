package com.package1;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array 
   {
    static int[] rotate(int arr[],int k)
    {
      int n=arr.length;
      int[] After_rotation=new int[n];
      int j=0;
      k=k%n;
      for(int i=n-k;i<n;i++)
      {
    	  After_rotation[j++]=arr[i];  
      }
      
      for(int i=0;i<n-k;i++)
      {
    	  After_rotation[j++]=arr[i];
      }
      return After_rotation;
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
    	System.out.println("Enter element from where you want to rotate: ");
    	int k=sc.nextInt();
    	System.out.print(Arrays.toString(Rotate_Array.rotate(arr,k)));
    	sc.close();
	}
   }
