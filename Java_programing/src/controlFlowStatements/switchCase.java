package controlFlowStatements;

public class switchCase {

	public static void main(String[] args) {
		// its like if else
		int switchValue = 5;
		switch (switchValue) {
		case 1:
			System.out.println("value was 1");
			break; // if break is not mentioned, it will show the unpredctible results
		case 2:
			System.out.println("value was 2");
			break;
		case 3:
		case 4:
		case 5:
		case 6: // to check the number of conditions
			System.out.println("value was 3 or 4 or 5 or 6");
			System.out.println("Actually value was " + switchValue);
			break;

		default: // its like else
			System.out.println("value was not 1 or 2");
			break; // if this break is not mentioned , it will work because its mentioned in the
					// last
		}
		
		//switch case statement with char data type 
		char charValue = 'A';
		switch (charValue) {
		case 'A':
			System.out.println("A was Found");
			break;
		case 'B':
			System.out.println("B was Found");
			break;
		default:
			System.out.println("Nor A and B");
			break;
		}
		
		String month = "JanUaRy"; 
		switch(month.toLowerCase()) { //toLowercase is method of java will convert the String to lowercase
		case "january":  //its case sensitive & needs to precise unless toLowerCase is used
			System.out.println("Jan");
			break;
		case "june":
			System.out.println("June");
			break;
		default:
			System.out.println("Not Sure");
			break;
			
		}

	}

}
