package org.tnsif.capgemini.c2tc.ScannerClass;
import java.util.Scanner;
public class ScannerClassDemo {

	public static void main(String[] args) {
    Scanner Scan=new Scanner(System.in);
    System.out.println("Enter your Name");
    String Name=Scan.nextLine();
    System.out.println("Enter your Age");
    int Age=Scan.nextInt();
    System.out.println("Name:" + Name + "  Age:" +Age);
	}

}
