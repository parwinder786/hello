package InterviewOne;

public class PrintTables {
	
	
	
	public static void table(int t) {
		
		for( int i =1; i<=10;i++) {
			System.out.println(t*i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		table(4);    //method is static 

	}

}
