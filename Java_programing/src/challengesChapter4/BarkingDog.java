package challengesChapter4;

public class BarkingDog {
	public static void main (String[]args) {

		System.out.println(shouldWakeUp(true,1));
		System.out.println(shouldWakeUp(false,2));
	}

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

		if (barking == true) {

			if (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay > 22 && hourOfDay <= 23) {

				return true;

			} else {

				return false;

			}
		}
		return barking;
	}

}
