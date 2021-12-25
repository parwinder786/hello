package Numbers;

public class FactorialUsingRecrusion {

	      
	
	       //int result =1;
	       
	       public static int findfactorial(int n) {
	    	   
	    	if(n<=1) {
	    		return 1;
	    	}else return n*findfactorial(n-1); //5*5-1=5*4 first time  20 4*4-1= 20 4*3
	    	//calling method inside the factorial
	    	   
	       }
	
	
	
	public static void main(String[] args) {
		
		int n=5;
		//recursion means function calling itself
        
		System.out.println(findfactorial(n));
		
	}

}
