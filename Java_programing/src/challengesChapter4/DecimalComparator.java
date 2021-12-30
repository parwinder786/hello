package challengesChapter4;

public class DecimalComparator {

	public static void main(String[] args) {
		
		
		System.out.println(areEqualbyThreeDecimalPlaces(3.4566,3.4569));
	}
		
	public static boolean areEqualbyThreeDecimalPlaces (double number1, double number2) {
		int no1 = (int)(number1*1000);
		int no2 = (int)(number2*1000);
		if(no1==no2) {
		          return true;
		}else {
			       return false;
		}
		
	}

}
