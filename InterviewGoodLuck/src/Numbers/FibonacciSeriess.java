package Numbers;

public class FibonacciSeriess {

	  static void numbers(int a, int b){
		  
		  int c;
		  System.out.print(a+" " +b);
		  
	       for(int i=1;i<=10;i++) {
	    	   
	    	   c= a+b;
	    	   //System.out.print(" "+c);
	    	   
	    	   a=b;
	    	   b=c;	    	   
	       }	  		  
	  }
		
	public static void main(String[] args) {
       
		FibonacciSeriess.numbers(0,1);
	}

}
