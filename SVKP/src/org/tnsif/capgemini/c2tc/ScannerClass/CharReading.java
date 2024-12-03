package org.tnsif.capgemini.c2tc.ScannerClass;
import java.util.Scanner;
public class CharReading {

	public static void main(String[] args) {
    Scanner Scan=new Scanner(System.in);
    System.out.println("Enter a string");
    char C=Scan.next().charAt(0);
    System.out.println("The first Character of the input string " + C);
	}

}
