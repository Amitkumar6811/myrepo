package com.package1;

public class RecurssionEx2 
 {
   static int fibo(int n)
   {
	   // base case
	   if(n==0 || n==1) return n;
	   //sub problem
	   return fibo(n-1)+fibo(n-2);
   }
   
   static int fibo1(int n)
   {
	   // fibo= fibo(n
	   // base case
	   if(n==0 || n==1) return n;
	   //sub problem
	   return fibo(n-1)+fibo(n-2);
   }
   
   public static void main(String[] args) 
   {
	   System.out.println(RecurssionEx2.fibo(7));
	   System.out.println();
	   
//	for(int i=0;i<=10;i++)
//	{
//		System.out.print(fibo(i)+" ");
//	}
  }
 }
