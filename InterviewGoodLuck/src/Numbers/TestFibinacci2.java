package Numbers;

public class TestFibinacci2 {
	
	
	
	static double fib(double n) 
    { 
    if (n <= 0.0) 
       return n; 
    
    return fib(n-1.0) + fib(n-2.0); 
    } 
       
	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{ 
	    	
		    double n = 4.5; 
		    System.out.println(fib(n)); 
		    } 

}
