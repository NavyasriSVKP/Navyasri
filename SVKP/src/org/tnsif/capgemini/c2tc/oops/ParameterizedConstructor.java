package org.tnsif.capgemini.c2tc.oops;
class Myclass2
{
	String color;
	int cost;
	String Brand;
	//parameterized Constructor
    Myclass2(String color,int cost,String Brand)
    {
    	this.color=color;
    	this.cost=cost;
    	this.Brand=Brand;
    }
 }
public class ParameterizedConstructor {

	public static void main(String[] args) 
    {
		Myclass2 obj=new Myclass2("Black",2500000,"Audi");
		Myclass2 obj1=new Myclass2("Blue",2780000,"BMW");
        System.out.println(obj.color + " " + obj.cost + " " +obj.Brand);
        System.out.println(obj1.color + " " + obj1.cost + " " +obj1.Brand);
    }

}
