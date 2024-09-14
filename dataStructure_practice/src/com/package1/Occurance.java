package com.package1;

import java.util.Scanner;

public class Occurance 
{
	 static int occ(int arr[],int x)
	    {
	        int result=0;
	        //System.out.println("Enter the size of the array");
	        int n=arr.length;
	        for(int i=0;i<n;i++)
	        {
	        	if(arr[i]==x)
	        	 result++;
	        }
	    	return result;
	    }
	    static int occ1(int arr1[],int x1)
	    {
	    	int Li=-1;
	        //System.out.println("Enter the size of the array");
	        int n=arr1.length;
	        for(int i=0;i<n;i++)
	        {
	           if(arr1[i]==x1)
	           {
	        	 Li=i;  
	           }
	        }
	    	return Li;
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
	    	System.out.println("which element occurance you need");
	    	int n1=sc.nextInt();
	    	System.out.println("Occurence time of "+n1+" is: "+Occurance.occ(arr,n1));
	    	System.out.println("Last Occurence time of "+n1+" is: "+Occurance.occ1(arr,n1));
	    	sc.close();
		}
	   }
