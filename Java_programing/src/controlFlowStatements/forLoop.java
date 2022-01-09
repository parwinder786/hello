package controlFlowStatements;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(calculateInterest(10000,2.0));

		// for(init;termination;increment) {}

		 for(int i=0;i <5;i++) {
		 System.out.println(" Loop "+ i + " Hello;");
		 }

		for (int i = 2; i < 9; i++) {
			//System.out.println("10000 at " + i + " % interest " + calculateInterest(10000, i));
			System.out.println("10000 at " + i + " % interest " + String.format("%.2f",calculateInterest(10000, i)));
		// String format is used to format the output with 00 in the end
		}
		
		System.out.println(" ");
			// decerement patern 	
		for (int i = 8; i > 1; i--) {
			System.out.println("10000 at " + i + " % interest " + calculateInterest(10000, i));
		}
		System.out.println(" ");
	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}
}
