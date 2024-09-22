package com.package1;

import java.util.Scanner;

 public class spiralMatrix 
  {
     static void spiral(int arr[][],int r,int c)
     {
    	 int totalElement=0;
    	int leftcol=0, rightcol=c-1, toprow=0, buttomrow=r-1;
    	// topRow print--> leftcol to rightcol
    	while(totalElement<r*c) {
    	for(int j=leftcol;j<=rightcol && totalElement<r*c;j++)
    	{
    		System.out.print(arr[toprow][j]+" ");
    		totalElement++;
    	}
    	toprow++;
    	
    	// rightcol--> toprow to buttomrow 
    	for(int i=toprow;i<=buttomrow && totalElement<r*c;i++)
    	{
    		System.out.print(arr[i][rightcol]+ " ");
    		totalElement++;
    	}
    	rightcol--;
    	
    	//buttomrow--> rightcol to leftcol
    	
    	for(int j=rightcol;j>=leftcol && totalElement<r*c;j--)
    	{
    		System.out.print(arr[buttomrow][j]+" ");
    		totalElement++;
    	}
    	buttomrow--;
    	
    	// rightccol--> buttomrow to toprow
    	
    	for(int i=buttomrow;i>=toprow && totalElement<r*c;i--)
    	{
    		System.out.print(arr[i][leftcol]+" ");
    		totalElement++;
    	}
    	leftcol++;
    	}
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
	spiralMatrix.spiral(arr1, r1, c1);
	scr.close();
  }
  }
