package com.package1;

public class TwoDimension 
   {
	// print array
	   static void PrintArray(int[][] arr)
	   {
		   for(int i=0;i<arr.length;i++)
		   {
	 // Travels inside the 0th index element in the array 
			  for(int j=0;j<arr[i].length;j++)
			  {
				  System.out.print(arr[i][j]+" ");
			  }
			  System.out.println();
		   }
	   }
	   public static void main(String[] args)
	   {
		  int[][] arr1= {
				  {1,2,3},
				  {4,5,6},
				  {7,8,9}
		                };
		  
		PrintArray(arr1);
	   }
   }
 
