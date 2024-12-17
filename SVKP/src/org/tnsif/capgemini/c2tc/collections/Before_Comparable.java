package org.tnsif.capgemini.c2tc.collections;
class Person
{
	String name;
	int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}	
	void displayinfo()
	{
		System.out.println("Name : "+ name  + " Age :"+ age);
	}
}
public class Before_Comparable {

	public static void main(String[] args) {
		Person person1=new Person("Navya ",21);
		Person person2=new Person("Reshma ",13);
		person1.displayinfo();
		person2.displayinfo();
	}

}
