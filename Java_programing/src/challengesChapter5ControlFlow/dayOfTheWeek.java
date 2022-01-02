package challengesChapter5ControlFlow;

public class dayOfTheWeek {

	public static void main(String[] args) {
             printDayOfTheWeek(5);
             
	}

	private static void printDayOfTheWeek(int day) {
		//int switchValue = day;
		switch (day) {     //switch (switchValue) can also be used
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid day");
			break;
		}

	}

}
