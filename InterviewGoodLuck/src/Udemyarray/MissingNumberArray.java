package Udemyarray;

public class MissingNumberArray {

	public static void main(String[] args) {
		 
		int [] numarr = {1,2,3,5,6,7,8,9,10}  ; //4 is missed here
		
		
		int sum =0;
		int expectedsum=0;
		for (int i=0; i<numarr.length;i++) {
			
			
			sum =sum+numarr[i];    //will add all the numbers in array
		}
		 for(int i=0; i<=10;i++) {
			 expectedsum=expectedsum+i;
		 }
		System.out.println("the missing no is = " + (expectedsum-sum));
			
		//System.out.println(sum);
	}

}
