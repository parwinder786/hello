package Numbers;

public class FibonacciSeries2{

	
static int fibonacci(int n) 
	
    { 
		
	  
		  if(n<0) 
			  System.out.println("plz");
		      //System.exit(1);
			 // return n;
			  
		  else if (n <= 1)             
		    return n; 
		 
			  return fibonacci(n-1) + fibonacci(n-2); 
			  
	    } 
	       
	    public static void main (String args[]) 
	    { 
	    	
	  int n = 3; 
	      
	  FibonacciSeries2.fibonacci(n);
	     
}
	
	
}

