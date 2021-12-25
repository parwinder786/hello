package com.sccanerex;

import java.util.Scanner;

public class Inputread {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input name");
		String name = input.next();
		
		System.out.println("name = " + name);
		System.out.println("input integer");
		
		int a  = input.nextInt();
		//int a = Integer.parseInt(aint);
		System.out.println("a = " + a);
		System.out.println("input many numbers");
		int total = 0;
		while(input.hasNextInt()){
			total = total + input.nextInt();			
		}
	System.out.println("total = " + total);	
	System.out.println("input many text");
	String temp = " ";
	while(input.hasNext()){
		temp = input.next();
		if(temp.equals("exit")) break;
	}
			
	System.out.println("out of loop");		
	}

}
