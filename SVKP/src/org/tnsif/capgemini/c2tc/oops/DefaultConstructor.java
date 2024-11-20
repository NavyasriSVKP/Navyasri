package org.tnsif.capgemini.c2tc.oops;
class Myclass1
{
	String color;
	int cost;
	String Brand; 
	//default constructor
	Myclass1()
	{
    color="Black";
    cost=2000000;
    Brand="BMW";
	}
  }
public class DefaultConstructor {

	public static void main(String[] args) {
    Myclass1 obj=new Myclass1();
    System.out.println(obj.color + " " + obj.cost + " "  + obj.Brand);
	}

}
