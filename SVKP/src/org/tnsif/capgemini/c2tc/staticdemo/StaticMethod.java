package org.tnsif.capgemini.c2tc.staticdemo;
class MathUtils
{
 public static int square(int number)
 {
  return number*number;
 }
 public static int add(int a,int b)
 {
	  return a+b;
 }
}

public class StaticMethod {

	public static void main(String[] args) {
   int result1=MathUtils.square(4);
   int result2=MathUtils.add(8,5);

   System.out.println("square of 4:" + result1);
   System.out.println("add of number:" + result2);

	}
 }
