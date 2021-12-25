package Numbers;

public class FibionacciSeries {

	public static void main(String[] args) {
		
		
		// 0 1 1 2 3 5 8 13 21  plus of two numbers is next number	
		// 0+1= 1 1+1= 2    1+2=3
		//first numebers will be fixed 0 & 1 
				
		int first =0;
		
		int second =1;
		
		int n=10;        //printing series till n
		
		for(int i=0;i<n;i++) {
			
			
			System.out.println(first+ "   ");
			int third= first+second;  //0+1=1
	                                                     //System.out.println(third);
	        first= second;   //second will become first 1
	        second=third;    //third will become second  1    first will be finlay 1 now   ( 0 1 1(1=2 % 2=3 so 1=3 )
	                         
	        
	        //System.out.println(first+ "   ");
			
		}
	}

}
