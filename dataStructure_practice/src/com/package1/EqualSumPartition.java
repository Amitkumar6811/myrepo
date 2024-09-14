package com.package1;

import java.util.Scanner;

public class EqualSumPartition 
   {
	//Addition of array
	
	static int arrayAdd(int arr[])
	{
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	
	 // To check equal sum partition exist or not 
	
      static boolean equalSumParti(int arr[])
      {
    	  int totalSum=EqualSumPartition.arrayAdd(arr);
    	  int n=arr.length;
    	  int prefixSum=0;
    	  
    	  for(int i=0;i<n;i++)
    	  {
    		prefixSum+=arr[i];  
    		int SuffixSum=totalSum-prefixSum;
    		if(prefixSum==SuffixSum)
    		{
    			return true;
    		}
    	  }
    	  return false;
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
	    	//SquareOfArray.squareofarray(arr);
	    	System.out.println(EqualSumPartition.equalSumParti(arr));
	    	sc.close();
		}
   }
