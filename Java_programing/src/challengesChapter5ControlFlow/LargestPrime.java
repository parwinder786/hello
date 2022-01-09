package challengesChapter5ControlFlow;

public class LargestPrime {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the largest prime number is = "+getLargestPrime(45));

	}
     public static int getLargestPrime(int number) {
    	 if(number<2) {
    		 return -1;
    	 }
    	 for(int i =2;i <number;i++) {  // 2nd iteration i 2+1=3
    		 if((number%i)==0) {  //21%3=0 with 2 its false i      7/3= 1
    			 number = number/i;   //21/3=7 no is 7          7 number will be return,
    			 i--;   // i is 2 now, i ++ will increment to 3 in loop for next iteration    
    		 }
    	 }
    	 return number;
     }
	
	
	
}
