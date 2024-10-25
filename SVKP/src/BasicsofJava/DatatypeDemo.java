package BasicsofJava;

public class DatatypeDemo {

	public static void main(String[] args) {
	 byte byteMax=127;
	 byte byteMin=-128;
	 System.out.println("Max range of byte is " +byteMax +" Min range of byte is" +byteMin);

	 short shortMax=32767;
	 short shortMin=-32768;
	 System.out.println("Max range of short is " +shortMax +" Min range of short is" +shortMin);

	 int MaxInt=2147483647;
	 int MinInt=-2147483648;
	 System.out.println("Max range of int is " +MaxInt +" Min range of int is" +MinInt);
	 
	 long MaxLong=9223372036854775807L;
	 long MinLong=-9223372036854775808L;
	 System.out.println("Max range of long is " +MaxLong +" Min range of long is" +MinLong);
	 
	 float f=3234.141243278345f;
	 double d=3456.14124512345678902345678914d;
	 System.out.println("float value " +f +" double " +d);
	 
	 boolean status=false;
	 System.out.println("boolean value is " +status);
	 
	 char c='M';
	 System.out.println("char value " +c);
	}
}

