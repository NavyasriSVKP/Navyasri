package BasicsofJava;

public class Increment_DecrementOperator {

	public static void main(String[] args) {
  int a=5;
  //post increment
  System.out.println("a++  " + a++);//Print first then increment
  System.out.println("After post increment a  " +a);
  //pre increment
  System.out.println("++a  " + ++a);//increment first then prints
  System.out.println("After pre increment a  " +a);
  //post decrement
  System.out.println("a--  " + a--);//Prints first the decrement
  System.out.println("After post decrement a  " +a);
  //pre decrement
  System.out.println("--a  " + --a);//decrement first then prints
  System.out.println("After pre decrement a  " +a);
	}

}
