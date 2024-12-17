package org.tnsif.capgemini.c2tc.exception_handling;
public class ThrowDemo {
	void validate(int age) {
		
	if(age<18)
	{
		throw new ArithmeticException("they are not eligible for C2TC");
	}
	else
	{
		System.out.println("You are Eligible");
	}
	}
	
	
	public static void main(String[] args) {
		 ThrowDemo obj=new  ThrowDemo();
		 obj.validate(22);
		 System.out.println("welcome C2TC");

	}
}