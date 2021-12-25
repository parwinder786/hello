package errorhandling;

import java.util.InputMismatchException;

public class Pratice {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		try{
			int c = 10/0;
			System.out.println("division result is = "+c);
		}catch(ArithmeticException abc){
			//anyformation will store in abc object
			System.out.println("something worng happened here "+abc.getMessage());
			System.out.println("seems you entered wrong information value>0");
		}
		catch(InputMismatchException e){
			System.out.println("something wrong "+e.getMessage());
					
		}
		catch (Exception e){
			//if this parent class define all exception all the catch will become dead code 
			//dead code that will never executed and parent class should come last always
		}
			finally {
				System.out.println("this will always run");
			}
		System.out.println("End");
	}

}
