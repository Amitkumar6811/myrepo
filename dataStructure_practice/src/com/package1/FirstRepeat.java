package com.package1;

import java.util.Scanner;

public class FirstRepeat 
	{
	static int firstReapting(int arr[])
	{
		//int values=0;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					return arr[i];
				}
			}
		}
		return -1;
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
    	System.out.println("First repeting number is: ");
    	System.out.print(FirstRepeat.firstReapting(arr));
    	sc.close();
	}
	}
