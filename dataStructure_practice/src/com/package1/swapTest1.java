package com.package1;

class person
{
	String name;
	float marks;
	person(String name,float marks)
	{
		this.name=name;
		this.marks=marks;
	}
}

public class swapTest1 
  {
	public static <Object> void swap(Object x,Object y)
	{
		Object temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("x==="+x);
		System.out.println("y==="+y);
		
	}
	public static void main(String[] args) 
	{
		Object p1=new person("amit",(float) 99.6);
		Double p2=new Double(23);
	    swap(p1,p2);
	    System.out.println(p1+"---------------- "+p2);
	    System.out.println(p1+" +++++"+p2);
	}
	
  }

