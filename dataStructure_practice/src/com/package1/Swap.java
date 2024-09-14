package com.package1;

import java.util.Scanner;

public class Swap 
	{
	static void swap1(int a,int b)// 10,15
	{
		System.out.println("Before swaping the value");
		System.out.println(a);
		System.out.println(b);
		
	 int temp=a; 
		a=b;
		b=temp;
		
		System.out.println("After swaping the value");
		System.out.println(a);
		System.out.println(b);
	}
	// without extra variable second method
	
	static void swap2(int a,int b)
	{
		System.out.println("Before swaping the value");
		System.out.println(a);
		System.out.println(b);
		//a=5,b=3
	    a=a+b;//a=8
	    b=a-b;//b=5
	    a=a-b;//a=3
		
		System.out.println("After swaping the value");
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
	 Scanner scr=new Scanner(System.in);
	 System.out.println("Enter two number...");
	 int a=scr.nextInt();
	 int b=scr.nextInt();
	 swap1(a,b);	
	 System.out.println("-----------------------------");
	 swap2(a,b);
	 scr.close();
	}
	}
