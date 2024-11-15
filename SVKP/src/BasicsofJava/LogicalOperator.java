package BasicsofJava;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=8,b=9,c=10;
		//logical AND
        System.out.println("(a>b) && (b<c)"+((a>b) && (b<c)));
		//Logical OR
		System.out.println("(a>b) || (b>c)"+((a>b) || (b>c)));
		//Logical Not
		System.out.println("!(a>b)"+ !(a>b));
	}

}
