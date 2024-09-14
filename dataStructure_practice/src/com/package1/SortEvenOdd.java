package com.package1;

import java.util.Scanner;

////sort an array consisting of only even and odd
public class SortEvenOdd 
  {
    static void sort(int arr[])
    {
    	int n=arr.length;
    	int left=0;
    	int right=n-1;
    	
       while(left<right)
       {
    	   if(arr[left]%2==1 && arr[right]%2==0)
    	   {
    		  swap(arr,left,right);
    		  left++;
    		  right--;
    	   }
    	   if(arr[left]%2==0)
    	   {
    		   left++;
    	   }
    	   if(arr[right]%2==1)
    	   {
    		   right--;
    	   }	   
       }
    }
    // Array swaping method 
    static void swap(int arr[],int i,int j)
    {
 	      int temp=arr[i];
 	        arr[i]=arr[j];
 	        arr[j]=temp;
    }
    // Array printing method
    static void Arrayprint(int arr[])
    {
    	for(int data:arr)
    	{
    		System.out.print(data);
    	}
    }
    
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
    	//int result[]=Reverse_Array.reverse(arr);
    	SortEvenOdd.sort(arr);
    	SortEvenOdd.Arrayprint(arr);
    	sc.close();
	}
}
