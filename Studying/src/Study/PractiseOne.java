package Study;

public class PractiseOne {

	public static void main(String[] args) {
		

	          int [][] twodim = new int [3][3];
	          
	          
	            int a = 1;
	            
	            for(int i =0; i<3;i++) {
	            	for(int j=0;j <3;j++) {
	            		twodim [i][j]= a;
	            		a= a+1;
	            	
	            	}
	            }
	          for (int i =0; i<3; i++) {
	        	  for(int j =0;j<3;j++) {
	        		  
	        		  System.out.print(twodim[i][j]);
	        		  
	        	  }
	        	  System.out.println();
	        	  
	          }
	          
	          
	}

}