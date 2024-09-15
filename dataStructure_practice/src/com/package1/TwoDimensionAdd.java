package com.package1;

import java.util.Scanner;

public class TwoDimensionAdd 
  {
     static void Add(int[][] arr1,int r1,int c1,int[][] arr2,int r2,int c2)
     {
    	 if(r1!=r2 || c1!=c2)
    	 {
    		 System.out.println("Wrong Input - Addition not possible ");
    		 return;
    	 }
    	 // Addition operation 
    	 int[][] sum=new int[r1][c1];
    	 for(int i=0;i<r1;i++) //row
    	 {
    		for(int j=0;j<c1;j++) 
    		{
    		 sum[i][j]= arr1[i][j]+arr2[i][j];
    		}
    	 }
    	 PrintMatrix(sum);
     }
     
     // print matrix 
     
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
     
     //  main method 
     
     public static void main(String[] args) 
     {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the row and column of matrix 1 ");
		int r1=scr.nextInt();
		int c1=scr.nextInt();
		
		int[][] arr1=new int[r1][c1];
		System.out.println("Enter "+ r1*c1 +" matrix value...");
		 for(int i=0;i<r1;i++)
		 {
			 for(int j=0;j<c1;j++)
			 {
				arr1[i][j]=scr.nextInt(); 
			 }
		 }
		
		 System.out.println("Enter the row and column of matrix 2 ");
		 int r2=scr.nextInt();
		 int c2=scr.nextInt();
		 int[][] arr2=new int[r2][c2];
		 System.out.println("Enter "+ r2*c2 +" matrix value...");
		 
		 for(int i=0;i<r2;i++)
		 {
			 for(int j=0;j<c2;j++)
			 {
				 arr2[i][j]=scr.nextInt();
			 }
		 }
		 System.out.println("Mtrix 1...");
		 PrintMatrix(arr1);
		 System.out.println("Mtrix 2...");
		 PrintMatrix(arr2);
		 //System.out.println("Sum of Array...");
		 Add(arr1, r1, c1, arr2, r2, c2);
		
	 }
  }
