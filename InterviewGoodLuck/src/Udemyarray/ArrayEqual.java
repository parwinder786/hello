package Udemyarray;

import java.util.Arrays;

public class ArrayEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arrray1= {1,2,3,4};
		int [] array2 = {1,2,3,4};
		
		
		if(Arrays.equals(arrray1, array2)) {
			System.out.println("array are same");
		}else {
			System.out.println("arrays are not the same");
		}

	}

}
