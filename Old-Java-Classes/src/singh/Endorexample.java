package singh;

public class Endorexample {

	public static void main(String[] args) {
	int x, y;
	x = 10;
	y = -10;
	if (x > 0 && y > 0){
		System.out.println("both num are +ve");
	}else if(x > 0 || y > 0){
		System.out.println("atleast one num is +ve");

	}else{ 
		System.out.println("both nums are -ve");
	}
	}

}
