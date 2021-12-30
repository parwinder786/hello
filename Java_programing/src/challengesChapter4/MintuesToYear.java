package challengesChapter4;

public class MintuesToYear {

	public static void main(String[] args) {
	
		printYearsAndDays(3333488);
		
	}

	public static void printYearsAndDays(long mintues) {
		if (mintues < 0) {
			System.out.println("Invalid Value");
		} else {
			long hours = mintues / 60;

			long days = hours / 24; // 390

			long year = days / 365; // 1
			long remainingdays = days % 365;

			System.out.println(mintues + " min = " + year + " y and " + remainingdays + " d");

		}

	}
}
