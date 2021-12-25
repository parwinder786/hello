package Study;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub          two dim  0,0 row,column TwoDim [0,0] [0,1]
		                                                                          //[1,0]  [1,1]
      
		
		
		int [][]twodim = new int [4][3];         //4 rows and 3 columns 
		
	/*	twodim[2][1]= 10;
		//System.out.println(twodim);
*/		
	int temp=10;
		
		for (int i=0; i<4;i++) {
			for(int j=0; j<3; j++) {
				
				
				
				twodim [i][j] = temp;
				temp = temp+10;
			}
		}
		//System.out.println(temp);
		for (int i=0;i<4;i++) {
			for( int j =0;j<3; j++) {
				//System.out.println(twodim[i][j]);
				System.out.print(twodim[i][j] + "    "  );      //to print horozontally use print instead of print println
			}
		}
	}

}
