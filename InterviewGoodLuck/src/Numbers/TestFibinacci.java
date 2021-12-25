package Numbers;

public class TestFibinacci {
	
	
	
	 static int fib(int n) 
	    { 
	    if (n<0) {
	    	System.exit(1);
	    }
	    else if (n==1 && n ==0) {
	    	return n; 
	    }
	    return fib(n-1)+ fib(n-2);
	    }
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestFibinacci.fib(7);
	}

}
