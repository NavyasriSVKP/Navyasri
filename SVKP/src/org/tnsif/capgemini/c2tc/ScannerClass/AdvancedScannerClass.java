package org.tnsif.capgemini.c2tc.ScannerClass;
import java.util.Scanner;
public class AdvancedScannerClass {

	public static void main(String[] args) {
    Scanner Scan=new Scanner(System.in);
    System.out.println("Enter some data(you can enter number or text)");
    while(Scan.hasNext())
    if(Scan.hasNextInt())
    {
    	int intvalue=Scan.nextInt();
    	System.out.println("Read an integer" +intvalue);
    }
    else if(Scan.hasNextDouble())
    {
    	double doublevalue=Scan.nextDouble();
    	System.out.println("Read an double" +doublevalue);
    		
    	}
    else
    {
    	String Stringvalue=Scan.next();
    	System.out.println("unknow input" +Stringvalue);
    }
	}
}