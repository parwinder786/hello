package Study5;

public class VariableArguments{
	
	
	//public static void addnumbers(int a, int b, int c)
	
	public static void addnumbers(int ...a){    // YOU can number of variables instead of limited
		//int sum = a+b+c;
		
		
		int sum = 0;                    // loop for how many numbers
		for (int x: a) {
			sum += x;
		}
		
		System.out.println("sum   =   "+sum);
	}
	
	public static void main (String args[]) {
		/*VariableArguments obj = new VariableArguments();
		
		obj.addnumbers(5, 5, 5);
		*/

		//VariableArguments.addnumbers(4, 4, 4);
		
		//VariableArguments.addnumbers(4, 4, 4, 6,  7);   will show error variable are more than 3 
		
		VariableArguments.addnumbers(4, 4, 4, 6,  7); // to correct it we have to use int ....a in main method instead of int a int b int c
		
		
	}


}
