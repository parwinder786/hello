package InterviewOne;

public class Jaspreet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] a = new int[] {2,4,66,7,9};
		
		int max, min;
		 max =a[0];
		min =a[0];
		
	      for(int i=1; i<a.length;i++) {
	    	  
	    	  if(a[i]>max) {
	    		  
	    		  max =a[i];
	    	  }
	    	  else if (a[i]<min){
	    		  min  = a[i];
	    	  }
	    	  	    	  
	      }
		System.out.println("the max no is "+max);
		System.out.println("the min no is"+min);
		
		

	}

}
