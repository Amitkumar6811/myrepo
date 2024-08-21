package com.package1;
import java.util.*;
public class matrix 
{
public static void main(String[] args) 
{
	Scanner scr=new Scanner(System.in);
	int N=scr.nextInt();
	int mat[][]=new int[N][N];
	for(int i=0;i<N;i++)
	{
		for(int j=0;j<N;j++)
		{
			mat[i][j]=scr.nextInt();
			
		}
	}
	for(int k =0;k<mat.length;k++)
	{
		for(int l=0;l<mat.length;l++)
		{	
		System.out.print(("["+mat[k][l])+"]"+" ");
		}
		System.out.println();
	}
	
	int n=mat.length;
	 for(int i=1;i<n;i++)
	 {
		 System.out.println(i);
	 }
}
}
