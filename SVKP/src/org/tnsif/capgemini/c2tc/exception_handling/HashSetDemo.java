package org.tnsif.capgemini.c2tc.exception_handling;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("Pineapple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple");
		set.add("Banana");

		System.out.println("Hashset :"+ set);
	}

}