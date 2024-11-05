package BasicsofJava;

public class IfElseIfDemo {

	public static void main(String[] args) {
		int score=46;
		if(score>95)
		{
			System.out.println("Grade A");
		}
		else if(score>=85)
		{
			System.out.println("Grade B");
		}
		else if(score>=75)
		{
			System.out.println("Grade C");	
		}
		else if(score>=65)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
