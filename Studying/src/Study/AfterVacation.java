package Study;

public class AfterVacation {
	


	public static void main(String[] args) {
		
          
		 int twodim [][] = new int [2][2];
		 
		 
		 int temp =11;
		 
		 for(int i=0;i<2;i++) {
			 for(int j=0;j<2;j++) {
				 
				 twodim[i][j]=temp;
				 temp=temp+11;
			 }
			 
		 }
          for(int i=0;i<2;i++) {
        	  for(int j=0;j<2;j++) {
        		  System.out.println(twodim[i][j]);
        	  }
          }
 
		
		}
		
}
		
	


