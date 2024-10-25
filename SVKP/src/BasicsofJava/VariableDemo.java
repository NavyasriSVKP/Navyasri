package BasicsofJava;

public class VariableDemo {
    int id=10;
    void print()
    {
    	String msg="Hello";
    	System.out.println(msg);
    }
    static String message="Hello students";
	
    public static void main(String[] args) {
	   VariableDemo obj=new VariableDemo();
	   System.out.println(obj.id);
	   obj.print();
       System.out.println(message);
	}

}
