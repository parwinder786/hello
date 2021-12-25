package errorhandling;

public class Exceptionexample {

	public static void main(String[] args) {
	       int d [] = new int [3];
	       int a = 10;
	       int b = 1;
	       int c = a/b;
	      try { 
	       c = a/b;
	      // d [5] = 10;
	    
	      } catch (Exception e ){
	    	  System.out.println("exception oocured" + e );	    	   
	      } finally{
	    	  System.out.println("will always run");
	      }
	      
	      
	      System.out.println("c = " + c);
	}

}
