package org.tnsif.capgemini.c2tc.interfacedemo;

public class InterfaceDemo {

	public static void main(String[] args) {
    Vehicle Car=new Car("toyota Corolla");
    Vehicle Bike=new Bike("Mountain Bike");
    Car.start();
    Car.stop();
    
    Bike.start();
    Bike.stop();
    System.out.println("Maximum speed for Vehicle " + Vehicle.max_speed);
	}

}
