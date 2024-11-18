package org.tnsif.capgemini.c2tc.oops;

class Human
{
	 int age;
	String name;
}

public class BeforeEncapsulation {

	public static void main(String[] args) {

		Human obj=new Human();
		obj.age=23;
		obj.name="Navya";
		obj.age=24;
		obj.name="Reshma";
		System.out.println("Age is "  +obj.age);
		System.out.println("Name is " +obj.name);

	}
}

