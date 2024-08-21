package com.package1;

public class vargsmethodsDemo 
 {
    static void vargsMeth(int v[])
    {
    	System.out.println("no of argument "+v.length+" Elements");
    	for(int data:v)
        System.out.println(data+" ");
    	System.out.println();
    }
    public static void main(String[] args)
    {
		int x[]=new int[] {1,3,5,7,};
		int y[]= {5,8};
		int z[]= {};
		
		vargsMeth(x);
		vargsMeth(y);
		vargsMeth(z);
	}
  }
