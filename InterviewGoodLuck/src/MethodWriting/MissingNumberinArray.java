package MethodWriting;

public class MissingNumberinArray {

	      public static void missing(int arr[]) {
	    	  
	    	  
	    	  int sum =0;
	    	  int expectedsum =0;
	    	  
	    	  for(int i=0;i<arr.length;i++) {
	    		  
	    		  sum=sum+arr[i];
	    	  }
	    	  System.out.println(sum);
	    	  
	    	  for(int j=0;j<=10;j++) {
	    		  expectedsum = expectedsum+j;
	    	  }
	    	  System.out.println(expectedsum);
	    	  
	    	  System.out.println("the missing number is "+(expectedsum-sum));
	      }
	
	
	
	
	public static void main(String[] args) {
		
	 int att[] = new int [] {1,2,3,4,5,6,7,8,10};
             missing(att);
	}

}
