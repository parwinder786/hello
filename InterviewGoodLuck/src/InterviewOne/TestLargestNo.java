package InterviewOne;

public class TestLargestNo {

	public static void main(String[] args) {
		
	  int a [] = new int [] {1,2,3,4,5,6};
	  
	  int min = a[0];
	  
	  int max = a[0];
	  
	  for(int i=1; i<a.length; i++) {
		  
		  if(a[i]>max) {
			  max= a[i];
		  }
		  if(a[i]<min){
			  min = a[i];
			  
		  }
	  }
	     System.out.println("max no is = "+max);
	     System.out.println("min no is "+min);
	          				
}
}