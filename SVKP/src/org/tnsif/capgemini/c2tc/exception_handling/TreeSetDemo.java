package org.tnsif.capgemini.c2tc.exception_handling;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> set=new TreeSet<>();
		set.add("Cherry");
		set.add("Banana");
		set.add("Apple");
		set.add("Cherry");
		
		System.out.println("Treeset " +set);
	}

}