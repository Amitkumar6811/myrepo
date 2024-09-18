package com.package1;

import java.util.Scanner;

public class RotateMatrix 
   {
     static void InPlacetransPose(int arr[][],int r,int c)   
     {
    	for(int i=0;i<r;i++)
    	{
    		for(int j=i;j<c;j++)
    		{
    			int temp=arr[i][j];
    			arr[i][j]=arr[j][i];
    			arr[j][i]=temp;
    		}
    	}
     }
     static void PrintMatrix(int arr[][])
     {
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 for(int j=0;j<arr[i].length;j++)
    		 {
    			 System.out.print(arr[i][j]+" ");
    		 }
    		 System.out.println();
    	 }
     }
     static void ReverseMatrix(int arr[])
     { 
    	 int i=0;
    	 int j=arr.length-1;	 
    	 while(i<j)
    	 {
    		 int temp=arr[i];
    		 arr[i]=arr[j];
    		 arr[j]=temp;
    		 i++;
    		 j--;
    	 }
     }
     
     static void rotate(int[][] matrix,int n)
     {
    	 //find transepose of matrix
    	 RotateMatrix.InPlacetransPose(matrix,n,n);
    	 //reverse of matrix
    	 for(int i=0;i<n;i++)
    	 {
    		 RotateMatrix.ReverseMatrix(matrix[i]);
    	 }
     }
     public static void main(String[] args) 
     {
		 Scanner scr=new Scanner(System.in);
		 System.out.println("Enter the row and column of the matrix");
		 int r=scr.nextInt();
		 int c=scr.nextInt();
		 int matrix[][]=new int[r][c];
		 System.out.println("Enter "+c*r+" Element ");
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
			matrix[i][j]=scr.nextInt();
			 }
		 }
		System.out.println("Original matrix...");
		RotateMatrix.PrintMatrix(matrix);
		System.out.println("***************************");
		rotate(matrix, c);
		System.out.println("After rotation of matrix...");
		RotateMatrix.PrintMatrix(matrix);
		
		
		scr.close();
	}
   }
