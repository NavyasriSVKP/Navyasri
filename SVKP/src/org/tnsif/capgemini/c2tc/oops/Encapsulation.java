package org.tnsif.capgemini.c2tc.oops;

public class Encapsulation {

	public static void main(String[] args) {
		class Human1
		{
			private int age;
			private String name;
			
			public void setAge(int age) {
				this.age = age;
			}
			public int getAge() {
				return age;
			}
			public void setName(String name) {
				this.name = name;
			}

			public String getName() {
				return name;
			}
		}
		Human1 obj=new Human1();
		obj.setAge(12);
		obj.setName("Navya");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		obj.setAge(22);
		obj.setName("Lavanya");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	}

}
