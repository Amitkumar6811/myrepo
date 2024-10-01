package com.package1;

import java.util.Scanner;

public class FindSum 
  {
     static int findsum(int arr[][],int L1,int r1,int L2,int r2)
     {
    	 int sum=0;
    	 for(int i=L1;i<=L2;i++)  //rows
    	 {
    		for(int j=r1;j<=r2;j++) //column
    		{
    			sum+=arr[i][j];
    		}
    	 }
    	 return sum;
     }
      
     
     public static void main(String[] args) 
     {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the row and colummn of the matrix");
		int r=scr.nextInt();
		int c=scr.nextInt();
		int matrix[][]=new int[r][c];
		System.out.println("Enter "+r*c+" Element: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				matrix[i][j]=scr.nextInt();
			}
		}
		System.out.println("Enter Rectangular boundries L1,r1,L2,r2");
		int L1=scr.nextInt();
		int r1=scr.nextInt();
		int L2=scr.nextInt();
		int r2=scr.nextInt();
		int result=FindSum.findsum(matrix, L1, r1, L2, r2);
		System.out.println("sum of ractangular boundry are: "+result);
		scr.close();	
	}  
  }
