package Study5;

public class UdemException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Thread.sleep(20000);   //to halt the execution 2000 means 20 seconds
		System.out.println("beginning");
		
		int divide =10/0;
		
		System.out.println(divide);
		
		System.out.println("ending");

		}catch(Throwable w) {                               //you can used Exception e insteasd of Throwable W
			System.out.println("error occured");
		}
	}

}
