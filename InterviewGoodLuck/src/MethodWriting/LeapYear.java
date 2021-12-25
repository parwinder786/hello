package MethodWriting;

public class LeapYear {
	
	public static void leap(int year) {
		
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	      
	}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leap(20);

	}

}
