package Udemyarray;

public class addingallNoinArrray {

	public static void main(String[] args) {
		 
		int [] numarr = {1,2,3,5,6,7,8,9,10}  ; //4 is missed here
		
		
		int sum =0;
		
		for (int i=0; i<numarr.length;i++) {
			
			
			sum =sum+numarr[i];    //will add all the numbers in array
		}
		 
		
		
		
		
		
		System.out.println(sum);
	}

}
