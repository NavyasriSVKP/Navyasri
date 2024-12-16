package org.tnsif.capgemini.c2tc.interfacedemo;
interface Vehicle1
{
	void start();
	void stop();
	int max_speed=120;
	default void repair()
	{
		System.out.println("Vehicle is being repaired");
	}
	static void checkmaintenance()
	{
		System.out.println("Vehicle is maintenance check complete");
	}
  }
   class Car1 implements Vehicle1
   {
   private String model;
   Car1(String model)
   {
	  this.model=model;
   }
   public void start()
   {
   System.out.println("Car" + model + "is started");
   }
   public void stop()
   {
	   System.out.println("Car" + model + "is stopped");
   }
  }
  public class Default_Static {

	public static void main(String[] args) {
    Vehicle1 obj=new Car1("BMW");
    obj.start();
    obj.stop();
    System.out.println("max_speed of the Vehicle" + Vehicle1.max_speed);
    obj.repair();
    Vehicle1.checkmaintenance();
	}

}
