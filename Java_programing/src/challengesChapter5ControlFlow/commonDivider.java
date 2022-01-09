package challengesChapter5ControlFlow;

public class commonDivider {

	public static void main(String[] args) {
	
          System.out.println("the common divisor is "+getCommonDivider(25,15));
          System.out.println("the common divisor is "+getCommonDivider(81,153));
	}

	public static int getCommonDivider(int first,int second) {
		if(first<10||second<10) {  
			return -1;
		}while(first !=second) {    //25 15 10 15 10 5 5 5(out of while loop) 81 153  81 72  9 72 9 63
			    if(first >second)   
			    	first = first - second;  //10  5      9  9  9    9   9   9   9    9
			    else {
			    	second = second -first;  //5  72       72 63  54  45  36  27   18   9 out of loop
			    }
		}
		return second;
	}
}
