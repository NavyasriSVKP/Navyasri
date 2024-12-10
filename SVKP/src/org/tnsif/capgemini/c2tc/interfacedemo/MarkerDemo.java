package org.tnsif.capgemini.c2tc.interfacedemo;

public class MarkerDemo {

	public static void main(String[] args) {
    Registrable S=new Student(201,"Navya",15000,"C++");
    Registrable S1=new Student(202,"Reshma",18000,"C");
    Object obj=new Object();
    if(S instanceof Registrable)
    	System.out.println("Student is registered for course");
    else
    	System.out.println("student is not registered for course");
	}

}
