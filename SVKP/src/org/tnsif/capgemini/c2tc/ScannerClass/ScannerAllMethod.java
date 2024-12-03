package org.tnsif.capgemini.c2tc.ScannerClass;
import java.util.Scanner;
public class ScannerAllMethod {

	public static void main(String[] args) {
    Scanner Scan=new Scanner(System.in);
    System.out.println("Enter your name");
    String name=Scan.nextLine();

    System.out.println("Enter your age");
    int age=Scan.nextInt();
    
    System.out.println("Enter your Height");
    float Height=Scan.nextFloat();
    
    System.out.println("Are you a Student");
    boolean isStudent=Scan.nextBoolean();
    
    System.out.println("Enter your aadhar number");
    long aadhar=Scan.nextLong();
    Scan.nextLine();
    
    System.out.println("Enter your Favourite Teacher");
    String Teacher=Scan.nextLine();

    System.out.println("Enter your Hobby");
    String Hobby=Scan.nextLine();
    
    System.out.println("Enter your CGPA");
    double CGPA=Scan.nextDouble();
    
    System.out.println("Enter your Daily reading time in minutes");
    Byte readingtime=Scan.nextByte();
    
    System.out.println("Enter no of siblings you have");
    short sibilings=Scan.nextShort();

    System.out.println("Student Information");
    System.out.println("name" +name);
    System.out.println("age" +age);
    System.out.println("Height" +Height);
    System.out.println("isStudent" +isStudent);
    System.out.println("aadhar" +aadhar);
    System.out.println("fav Teacher" +Teacher);
    System.out.println("Hobby" +Hobby);
    System.out.println("CGPA" +CGPA);
    System.out.println("reading time" +readingtime);
    System.out.println("sibilings" +sibilings);
	}

}
