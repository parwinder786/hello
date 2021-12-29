package FirstSteps;

public class DataType {

	public static void main(String[] args) {
                            
		int minValue = Integer.MIN_VALUE;
		int maxValue = Integer.MAX_VALUE;
		System.out.println("Integer minimum value is = " +minValue);
		System.out.println("Integer maximum value is = " +maxValue);

		System.out.println("the busted max value is = " +(maxValue + 1));
		System.out.println(" ");
		
		byte myMinValue = Byte.MIN_VALUE;
		byte myMaxValue = Byte.MAX_VALUE;
		
		System.out.println("Byte minimum value is = " +myMinValue);
		System.out.println("Byte maximum value is = " +myMaxValue);
		
		System.out.println(" ");
		
		short MinValue = Short.MIN_VALUE;
		short MaxValue = Short.MAX_VALUE;
		
		System.out.println("short minimum value is = " +MinValue);
		System.out.println("short maximum value is = " +MaxValue);
		
		
        System.out.println(" ");
		
	    long value = 100L;
	    
	    long MiniValue = Long.MIN_VALUE;
		long MaxiValue = Long.MAX_VALUE;
		
		System.out.println("long minimum value is = " +MiniValue);
		System.out.println("long maximum value is = " +MaxiValue);
		
		
		   System.out.println(" ");
			
		    
		    float MMiniValue = Float.MIN_VALUE;
			float MMaxiValue = Float.MAX_VALUE;
			
			System.out.println("Float minimum value is = " +MMiniValue);
			System.out.println("Float maximum value is = " +MMaxiValue);
			
			
			   System.out.println(" ");
				
			    double MMMiniValue = Double.MIN_VALUE;
				double MMMaxiValue = Double.MAX_VALUE;
				
				System.out.println("double minimum value is = " +MMMiniValue);
				System.out.println("double maximum value is = " +MMMaxiValue);
				
				int playerage =3;
								
				System.out.println("the player age " +playerage--);
				System.out.println("printing after the decrement-->prefix ");				
				System.out.println("the player age " +playerage--);
				
				int player =3;
				System.out.println("the player age postfix " + --player);
				
	    
			
	}
}
