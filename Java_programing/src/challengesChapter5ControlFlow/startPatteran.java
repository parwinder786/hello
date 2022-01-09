package challengesChapter5ControlFlow;

public class startPatteran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquareStar(5);
	}


		 
	    public static void printSquareStar(int number){
	        if(number < 5) System.out.println("Invalid Value");
	        else{
	            for (int row = 0; row <number; row++){  //0
	                for (int column=0; column<number; column++){  //0 1
	                    if(row==0 || row==number-1 || column==0 || column==number-1 || column==row || column==number-1-row)
	                    	//row = 1 col=2   
	                    	System.out.print("*");
	                    else System.out.print(" "); 
	                }
	                System.out.println("");
	            }
	        }
	    }

}
