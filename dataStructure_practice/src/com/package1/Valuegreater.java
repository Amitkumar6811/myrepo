package com.package1;

import java.util.Scanner;

public class Valuegreater
{
    static int greater(int arr[],int x)
    {
  	  int count=0;
  	  int n=arr.length;
  	  for(int i=0;i<n;i++)
  	  {
  		if(arr[i]>x)
  		{
  			count++;
  		}
  	  }	  
  	  return count;
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
    	System.out.println("Enter element");
    	int n1=sc.nextInt();
    	System.out.println("Given number of element");
    	System.out.print(Valuegreater.greater(arr,n1));
    	sc.close();
	}
}

