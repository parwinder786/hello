package varaarguments;

public class Varargs {
	public static void addnumbers(String b, int...a){
		//int sum = a + b + c;
		int sum = 0;
		for (int x : a){
			sum += x;
		}
			
		System.out.println("sum  = " + sum + " b = " + b);
	}
	public static void main(String args[]){
		//Varargs obj = new Varargs ();
		//obj.addnumbers(3, 4, 5);
		Varargs.addnumbers("parwinder",3, 4, 5,44,555);
		
	}

}
