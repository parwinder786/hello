package challengesChapter4;

public class AreaCalculate {

	public static void main(String[] args) {
	
		System.out.println(area(5.0));

	}

	public static double area(double radius) {

		if (radius < 0) {

			return -1.0;

		}

		return radius * radius * Math.PI;

	}

	public static double area(double sideX, double sideY) {

		if (sideX < 0 || sideY < 0) {

			return -1;

		}

		return sideX * sideY;

	}

}
