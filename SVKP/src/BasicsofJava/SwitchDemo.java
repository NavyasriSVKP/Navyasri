package BasicsofJava;

public class SwitchDemo {

	public static void main(String[] args) {
		String day="Tuesday";
		switch(day)
		{
		case "Monday":
		case "monday":
			System.out.println("Attend the meetings");
			break;
		case "Tuesday":
		case "tuesday":
			System.out.println("Work on project task");
			break;
		case "Wednesday":
		case "wednesday":
			System.out.println("Submit the progress");
			break;
		case "Thursday":
		case "thursday":
			System.out.println("Client call and review");
			break;
		case "Friday":
		case "friday":
			System.out.println("Wrap up weekly task");
			break;
		case "Saturday":
		case "saturday":
			System.out.println("Enjoy the weekend");
			break;
			default:
			{
				System.out.println("Invalid day");
			}
		}
	}
}