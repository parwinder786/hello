package Udemyarray;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
	
		
		int ab[]  = {1,2,3,66,33,99,1,2};
		
		System.out.println("--------before sorting---------------");
		for(int x:ab) {
			System.out.println(x);
		}
		
		System.out.println("--------------after sorting-----------------");
		Arrays.sort(ab);
		
		for(int y:ab) {
			System.out.println(y);
		}

	}

}
