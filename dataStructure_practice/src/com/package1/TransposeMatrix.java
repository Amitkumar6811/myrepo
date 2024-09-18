package com.package1;

import java.util.Scanner;

public class TransposeMatrix 
  {
     static void transPose(int[][] arr,int r,int c)
     {
    	 int TransPose[][]=new int[r][c];
    	 for(int i=0;i<r;i++) // Row
    	 {
    		 for(int j=0;j<c;j++) // Column
    		 {           
    		   TransPose[i][j]=arr[j][i];	 
    		 }
    	 }
    	 PrintMatrix(TransPose);
     }
     //Printing matrix Method 
     
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
    	// PrintMatrix(arr);
     }
     
     //Another method for transpose of matrix
     
     static void TransposInplace(int arr[][],int r,int c)
     {
    	 for(int i=0;i<r;i++) // Row
    	 {
    		 for(int j=i;j<c;j++) // Column
    		 {           
    			 int temp=arr[i][j];
    	    	   arr[i][j]=arr[j][i];
    	    	   arr[j][i]=temp; 
    		 }
    	 }
     }
     
     public static void main(String[] args) 
     {
		 Scanner scr=new Scanner(System.in);
		 System.out.println("Enter Row and Column of the matrix...");
		 int r=scr.nextInt();
		 int c=scr.nextInt();
		 int Matrix[][]=new int[r][c];
		 System.out.println("Enter "+(c*r)+" Element ");
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				Matrix[i][j]=scr.nextInt(); 
			 }
		 }
		 System.out.println("Original Matrix...");
		 PrintMatrix(Matrix);
		 System.out.println("***********************************");
		 System.out.println("Transpose of the matrix...");
		 TransposeMatrix.transPose(Matrix, r, c);
		 System.out.println("+++++++++++++++++++++++++++");
		 System.out.println("swapping method TransPOse of matrix...");
		 TransposInplace(Matrix, r, c);
		 PrintMatrix(Matrix);
		 scr.close();	 
	 }
     
  }
