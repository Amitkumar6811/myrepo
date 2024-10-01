package com.package1;

public class ThreadEx7 extends Thread
  {
    public void run()
    {
    	System.out.println("I am ready to attemp interview..");
    	for(int i=0;i<=5;i++)
    	{
    		System.out.println("This is my "+i+" Interview");
    	}
    	System.out.println("I got placed now, i can relaxed");
    	try
    	{
    		Thread.sleep(10000); //10 sec
    	}
    	catch(Exception e)
    	{
    		System.out.println("my sleep got distrub..");
    	}
    	System.out.println("Its time to go office..");
    }
    public static void main(String[] args) 
    {
    	ThreadEx7 obj=new ThreadEx7();
    	Thread t1=new Thread(obj);
    	
    	t1.start();
    	t1.interrupt();
	}
  }
