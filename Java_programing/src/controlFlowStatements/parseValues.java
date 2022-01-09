package controlFlowStatements;

public class parseValues {

	public static void main(String[] args) {
		String numberAsString = "2018.12";
		System.out.println("numberAsString = " + numberAsString);

		//int number = Integer.parseInt(numberAsString); // using integer class
		double numberD = Double.parseDouble(numberAsString);
		
		//System.out.println("number = " + number);
		System.out.println("number = " + numberD);
		
		numberAsString += 1;
		// += 1;
		numberD +=1;
		

		System.out.println("numberAsString = " + numberAsString); // will print 20181, concatenation not the addition
		//System.out.println("int number = " + number); // will print 2019 (perform addition becoz string converted to
													// integer)
        
		System.out.println("Double number = " + numberD);
	}

}
