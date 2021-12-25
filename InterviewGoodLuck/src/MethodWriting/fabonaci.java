package MethodWriting;

public class fabonaci {
	
	
	
	  public static void fab(int n) {
		  
		  
		  int first =0;
		  int second =1;
		  int third;
		  
		  for(int i=0;i<n;i++) {
			  System.out.println(first);
			  
			   third= first+second;
			   
               first= second;
               second= third;
            		 
		  }
		  
		  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fab(10);

	}

}
