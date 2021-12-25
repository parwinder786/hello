package singh;

public class Examplewhile {

	public static void main(String[] args) {
		/*int x = -10;
		while(x <= 0){
			System.out.println("x = " + x);
			x++;*/
		int [][] twodim = new int [4][3];            // -----3 (0-3)rows and 2(0-2) colums
         
         int temp = 10;                          //------temp is value set in arry,,here is 10 
      for (int i=0;i<4;i++){                   //-------i fo r 
       
       for(int j=0;j<3;j++){              
      twodim [i][j] = temp;
       temp = temp+10;
     System.out.println(twodim[i][j]);
       }
       }	
	}
}
