package com.package1;

import java.util.Scanner;

public class SecondLarge 
    {
		static int FirstLargest(int arr[])
		{
			int n=arr.length;
			int max=Integer.MIN_VALUE;
			for(int i=0;i<n;i++)
			{
				  if(arr[i]>max)
				  {
					  max=arr[i];
				  }
			}	
			return max;	
		}
		static int secondLargest(int arr[])
		{
		  int max=SecondLarge.FirstLargest(arr);
		  int n=arr.length;
		  for(int i=0;i<n;i++)
		  {
			 if(arr[i]==max)
			 {
				 arr[i]=Integer.MIN_VALUE;
			 }
		  }
		  int ans=SecondLarge.FirstLargest(arr);
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
		    	System.out.println("second largest number is: ");
		    	System.out.print(SecondLarge.secondLargest(arr));
		    	sc.close();
			}
    }
