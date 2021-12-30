package challengesChapter4;

public class Measurement {

	public static void main(String[] args) {
		calcFeetAndIncesToCentimeters(6, 0);
		calcFeetAndIncesToCentimeters(7, 5);
		calcFeetAndIncesToCentimeters(-7, -5);

		// to Check the Entered parameters at the starting

		double centimeters = calcFeetAndIncesToCentimeters(7, 13);
		if (centimeters < 0.0) {
			System.out.println("invalid parameters");
		}

		calcFeetAndIncesToCentimeters(100);
	}

	public static double calcFeetAndIncesToCentimeters(double feet, double inches) {
		if ((feet < 0) || ((inches < 0) || (inches > 12))) {
			System.out.println(" Invalid feet or incehs parameter");
			return -1;
		}
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
		return centimeters;

	}

	public static double calcFeetAndIncesToCentimeters(double inches) {
		if (inches < 0) {
			return -1;
		}
		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12;
		System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);

		return calcFeetAndIncesToCentimeters(feet, remainingInches);
		// Returning & Calling the method in one shot, return will get the whatever the method return
	}
}
