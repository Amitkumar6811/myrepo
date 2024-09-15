package com.package1;

import java.util.Scanner;

public class TwoDimensionMul 
   {
   static void PrintMatrix(int arr[][])
   {
	  int n=arr.length;
	  for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<arr[i].length;j++)
		  {
			  System.out.print(arr[i][j]+" ");
		  }
		  System.out.println();
	  }
   }
    static void ArrayMul(int arr1[][],int r1,int c1,int [][] arr2,int r2,int c2)
    {
    	if(c1!=r2)
    	{
    		System.out.println("Invalid dimention - Multiplecation not possible...");
    	}
    	int[][] mul=new int[r1][c2];
    	for(int i=0;i<r1;i++)
    	{
    		for(int j=0;j<c2;j++)
    		{
    			for(int k=0;k<c1;k++)
    			{
    				/*
    				 mul[i][j]=i th row of arr1 and j th column og=f arr2    				 
    				 */
    				mul[i][j]+=arr1[i][k]*arr2[k][j];
    			}
    		}
    	}
    	System.out.println("Multiplication of Matrix...");
    	PrintMatrix(mul);
    	
    }
    public static void main(String[] args) 
    {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the row and column of matrix 1...");
		int r1=scr.nextInt();
		int c1=scr.nextInt();
		int arr1[][]=new int[r1][c1];
		System.out.println("Enter "+r1*c1+" Element...");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				arr1[i][j]=scr.nextInt();
			}
		}
		System.out.println("Enter the row and column of matrix 2...");
		int r2=scr.nextInt();
		int c2=scr.nextInt();
		int arr2[][]=new int[r2][c2];
		System.out.println("Enter "+r2*c2+" Element...");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				arr2[i][j]=scr.nextInt();
			}
		}
		System.out.println("Matrix 1....");
		PrintMatrix(arr1);
		System.out.println("Matrix 2....");
		PrintMatrix(arr2);
		TwoDimensionMul.ArrayMul(arr1, r1, c1, arr2, r2, c2);
		scr.close();
	}
    
  }
