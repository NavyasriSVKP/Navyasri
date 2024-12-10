package org.tnsif.capgemini.c2tc.interfacedemo;

public class Bike implements Vehicle
{
  private String type;
  public Bike(String type)
	{
	  this.type=type;
	}
  public void start()
  {
	System.out.println("Bike" +type + " is starting");
	}
   public void stop()
   {
	System.out.println("Bike" +type + " is starting");
   }
}
