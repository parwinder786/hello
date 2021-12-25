package throwandthrows;

public class ProgA {

	public int dividenums(int a, int b) throws Exception {
		int c ;
		try{
			c = a/b; 
		}catch(Exception e ){
			System.out.println("proga exception");
			throw new Exception("please check your numbers");
			
		}
		
		return c;
		
		

	}

}
