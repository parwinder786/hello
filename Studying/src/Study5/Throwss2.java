package Study5;

public class Throwss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Throwss obj = new Throwss();
		//System.out.println(obj.dividenum(10, 2));    will work fine on these numbers
		
		try {
			System.out.println(obj.dividenum(10, 0));   //exception will occur now or after declaring the throw in firsat class now it
                                                        // show error here so we have to use try catch here
			 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("class b "+e.getMessage());
			
			
		}    //exception will occur now or after declaring the throw in firsat class now it
		                                               // show error here so we have to use try catch here 
	}

}
