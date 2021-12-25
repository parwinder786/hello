package InterviewOne;

public class TestLargestNo2 {

	public static void main(String[] args) {
	
	    int [] no = {2,4,5,6,7};
	    
	     int max = Integer.MIN_VALUE;
	     
	     for (int i = 0; i<no.length;i++) {
	    	 if(no[i]>max) {
	    		 max = no[i];
	    	 }
	     }
	     System.out.println("max no is "+max);
	}
	

}
