package Numbers;

public class Factorial {

	public static void main(String[] args) {
		
		
		//what is factorial  5!  = 5*4*3*2*1= 120         3!= 3*2*1=6  N!=n*(n-1).....*1
		
		int n=3;
		int fact =1;
		
		
		for(int i=1; i<=n;i++) {
			
			fact =fact*i;    //
		}
			System.out.println(fact);	

		
		

	}

}
