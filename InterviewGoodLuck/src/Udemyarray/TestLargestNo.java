package Udemyarray;

public class TestLargestNo {

	public static void main(String[] args) {
		
	  int a [] = {1,-2,3,4,5,6,0};
	  
	  int min = a[0];     //smmallest no first element is smallest
	  
	  int max = a[0];     //largest no first no is largest   a[0] represent 1
	                      // a[i] will check every no with max which is a[0]=1; if no is max then it will store in a[i]
	  
	  for(int i=1; i<a.length; i++) {    // i is taken 1 because we want to start from i=2 because a [0] has i=1  
		  
		  if(a[i]>max) {
			  max= a[i];   
		  }
		  else if(a[i]<min){
			  min = a[i];
			  
		  }
	  }
	     System.out.println("max no is = "+max);
	     System.out.println("min no is "+min);
	          				
}
}