package org.tnsif.capgemini.c2tc.oops;

public class Abstraction 
{
public static void main(String[] args) 
	{
    NavyaDemo obj=new ReshmaDemo();
    obj.calling();
    obj.AIIntegration();
    obj.SatelliteComm();
    obj.HealthMonitoring();
 }
}
  abstract class NavyaDemo
  {
	  public void calling()
	  {
		  System.out.println("Calling");
	  }
	  public abstract void AIIntegration();
	  public abstract void SatelliteComm();
	  public abstract void HealthMonitoring();
  }
  abstract class LavanyaDemo extends NavyaDemo
  {
	  public void AIIntegration()
	  {
		  System.out.println("Phone is integrated with AIIntegration");
	  }
  }
	class ReshmaDemo extends LavanyaDemo
	{
		public void SatelliteComm()
		{
			System.out.println("Phone is integreted with Satellite");
		}
		public void HealthMonitoring()
		{
			System.out.println("Phone is integrated with HealthMonitoring");
		}
	}