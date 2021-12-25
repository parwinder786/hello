package Study;

public class AndOrOperatior {

	public static void main(String[] args) {
		int x, y;
		x= 10;
		y=-10;
		if (x>0 && y>0) {
			System.out.println(" both no are + ");
		}
		else if  (x>0 || y>0) {
			System.out.println("  atleast one no is +");
		}
		else {
			System.out.println("no number is +");
		}
	}

}
