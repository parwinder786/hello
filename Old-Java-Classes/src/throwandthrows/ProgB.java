package throwandthrows;

public class ProgB {

	public static void main(String[] args) {
	ProgA obj = new ProgA();
	try {
	System.out.println(obj.dividenums(10, 0));
	}catch(Exception e){
		System.out.println("prog b = " + e.getMessage());
	}
	
	}

	
}
