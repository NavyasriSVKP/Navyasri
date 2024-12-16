package org.tnsif.capgemini.c2tc.exception_handling;

public class Demo {

	public static void main(String[] args) {
		int a=30;
		int b=10;
		int sum=add(a,b);
		
		System.out.println(sum);
	}
	public static int add(int a,int b)
	{
		return a-b;
	}

}