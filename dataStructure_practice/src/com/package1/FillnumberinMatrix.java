package com.package1;
import java.util.Scanner;

public class FillnumberinMatrix 
   {
	 static void spiral(int n)
     {
    	 
    	 int[][] arr=new int[n][n];
    	int leftcol=0, rightcol=n-1, toprow=0, buttomrow=n-1;
    	int count=1;
    	// topRow print--> leftcol to rightcol
    	while(count<=n*n) {
    	for(int j=leftcol;j<=rightcol && count<=n*n;j++)
    	{
    		arr[toprow][j]=count;
    		count++;
    		
    	}
    	toprow++;
    	
    	// rightcol--> toprow to buttomrow 
    	for(int i=toprow;i<=buttomrow && count<=n*n;i++)
    	{
    		arr[i][rightcol]=count;
    		count++;
       	}
    	rightcol--;
    	
    	//buttomrow--> rightcol to leftcol
    	
    	for(int j=rightcol;j>=leftcol && count<=n*n;j--)
    	{
    		arr[buttomrow][j]=count;
    		count++;
    	}
    	buttomrow--;
    	
    	// rightccol--> buttomrow to toprow
    	
    	for(int i=buttomrow;i>=toprow && count<=n*n;i--)
    	{
    		arr[i][leftcol]=count;
    		count++;
    	}
    	leftcol++;
    	}
    	FillnumberinMatrix.PrintMatrix(arr);
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
	public static void main(String[] args) 
	{
	Scanner scr=new Scanner(System.in);
	System.out.println("Enter the value of n...");
	int n=scr.nextInt();
	FillnumberinMatrix.spiral(n);
	scr.close();
  }
  }
