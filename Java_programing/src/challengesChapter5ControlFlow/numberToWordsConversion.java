package challengesChapter5ControlFlow;

public class numberToWordsConversion {

	public static void main(String[] args) {
		System.out.println("the count is " + getDigitCount(123));
		System.out.println(1 % 10);
		System.out.println("--------------");
		System.out.println("the reverse number --> " + reverse(123));
		
		System.out.println("--------------");
		//System.out.print(numberToWords(33));
         numberToWords(123);
	}
	
	public static void numberToWords(int number) {
		if(number<0) {
			System.out.println("Invalid Value");
		}
		int count= getDigitCount(number);  //3
		number = reverse(number);  //321
		for(int i = 0; i <count;i++) {
			int digit = number%10;  //1 2  3 
			switch(digit) {
			case 0:
				System.out.print("Zero ");
				break;
			case 1:
				System.out.print("One ");
				break;
			case 2:
				System.out.print("Two ");
				break;
			case 3:
				System.out.print("Three ");
				break;
			case 4:
				System.out.print("Four ");
				break;
			case 5:
				System.out.print("Five ");
				break;
			case 6:
				System.out.print("Six ");
				break;
			case 7:
				System.out.print("Seven ");
				break;
			case 8:
				System.out.print("Eight ");
				break;
			case 9:
				System.out.print("Nine ");
				break;
				
			}
			number /=10;   //32 3 0
		}
	}

	public static int reverse(int number) {
		int reverse = 0;
		// int digit =0;
		while (number != 0) {
			reverse = (reverse * 10) + number % 10; // 3 30+2=32 320 + 1 =321
			number /= 10; // 12 1 0
		}
		return reverse;
	}

	public static int getDigitCount(int number) {
		if (number < 0) {
			return -1;
		}
		int count = 0;
		do {
			count++;
			number /= 10;
		} while (number > 0);
		return count;
	}
}
