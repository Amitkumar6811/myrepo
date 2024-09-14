package com.package1;

//sort an array consisting of only 0s and 1s

import java.util.Scanner;

// Two pointer approach VVI
//01010101=00001111

public class SortZeroOnes 
   {
    static void sort_Zero_ones(int arr[])
    {
    	int n=arr.length;
    	int left=0;
    	int right=n-1;
      while(left<right)
      {
    	if(arr[left]==1 && arr[right]==0) 
    	{
    	   swap(arr,left,right);
    	   left++;
    	   right--;
    	}
    	if(arr[left]==0)
    	{
    		left++;
    	}
    	if(arr[right]==1)
    	{
    		right--;
    	}
      }	
    }
    
    // swaping array method 
    static void swap(int arr[],int i,int j)
    {
    	int temp=arr[i];
    	  arr[i]=arr[j];
    	  arr[j]=temp;
    }
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
    	SortZeroOnes.sort_Zero_ones(arr);
    	SortZeroOnes.Arrayprint(arr);
    	sc.close();
	}
}

