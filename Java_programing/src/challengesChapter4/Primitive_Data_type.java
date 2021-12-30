package challengesChapter4;

import org.omg.CORBA.SystemException;

public class Primitive_Data_type {

	// 
	public static void main(String[] args) {
		
		byte myByte = 10;
		short myShort = 20;
		int myInt = 50;
		long myLong = 50000L + (10L * (myByte+myShort+myInt));  // you can use the L or not because long > int
		System.out.println(myLong);
		
		// to convert the pound to KG
		
		double noOfPounds = 200d;
		double convertedKilograms = noOfPounds * 0.453359237d;
		System.out.println("converted kilograms = "+ convertedKilograms);
		
		//char for unicode char
		
		char mychar = 'D';     
		char myUnicodeChar = '\u0044';
		System.out.println(mychar);
		System.out.println(myUnicodeChar);
		
		//string 
		
		String value = "10";
		int Int = 50;
		value = value + Int;
		System.out.println(value);
		
		
		//operator challenge
		
		double var = 20.00;
		double var2 = 80.00;

		double multiplication = (var+var2)*100.00d;
		System.out.println(multiplication);

		double reminder = multiplication%40.00d;
		System.out.println(reminder);


		boolean isreminder = (reminder==0)? true: false;   //iternary operator
		System.out.println("is reminder true or false = "+isreminder);
		if(!isreminder){
		    System.out.println("got some reminder");
		}

						
	}
}
