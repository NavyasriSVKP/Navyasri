package org.tnsif.capgemini.c2tc.interfacedemo;
public class Car implements Vehicle 
  {
  private String model;
  public Car(String model)
  {
	  this.model=model;
  }
public void start()
{
	System.out.println("Car" + model + " is starting");
}
   public void stop()
  {
   System.out.println("Car" + model + " is stopped");
  }
}