package org.tnsif.capgemini.c2tc.staticdemo;

public class StaticVariable {
       String name;
       double price;
       public static String category="Smart phone";
	   public StaticVariable(String name,double price)
	   {
		   this.name=name;
		   this.price=price;
	   }
	   public void displaydetails()
	   {
		   System.out.println("Name" +name);
		   System.out.println("price" +price);
		   System.out.println("category" +category);
	   }
	public static void main(String[] args) {
    StaticVariable mobile1=new StaticVariable("Realme",13000);
    StaticVariable mobile2=new StaticVariable("Redmi",15000);
   
    System.out.println("mobile1 information");
    mobile1.displaydetails();
    
    System.out.println("mobile2 information");
    mobile2.displaydetails();
	}
}
