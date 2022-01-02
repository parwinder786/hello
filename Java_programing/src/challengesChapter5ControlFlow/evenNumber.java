package challengesChapter5ControlFlow;

public class evenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("The Given Even nuber is "+isEvenNumber(5));

		int startNo = 4;
		int lastNo = 24;
		int count = 0;

		while (startNo <= lastNo) {
			startNo++;
			if (!isEvenNumber(startNo)) {
				continue; // different than break, it will by pass the print statement & starts from loop
							// again
							// the execution does not go further down w
			}
			count++;
			System.out.println("The Given Even  nuber is " + startNo);
			if (count >= 5) {
				break;  //code is added to break when the 5 values are found
			}

		}

		System.out.println("Total even number found  " + count);
	}

	public static boolean isEvenNumber(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
