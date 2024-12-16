package org.tnsif.capgemini.c2tc.interfacedemo;

class GreetingImp implements FunctionalInterface
{

	@Override
	public void sayHello(String name) {
		System.out.println("Hello " +name+ " !");
		
	}
	
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		FunctionalInterface obj=new GreetingImp();
		obj.sayHello("Navya");

	}

}