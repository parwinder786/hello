package Study6;

import java.util.Scanner;

public class ReadUnput {

	public static void main(String[] args) {
				
		//String name = "alex";
		
		Scanner input = new Scanner(System.in);  // Scanner class is used to input values from console 
		System.out.println("input some name ");   //now you can enter name after runing it on console 
		
		String name = input.next();
		
		System.out.println("name   === "+name);		
		System.out.println("entering the integer value here on below------------");
				
		String aint = input.next();
		int a = Integer.parseInt(aint);         //to convert the string into integer 
		
		System.out.println("a      = "+a);
		
		int ab = input.nextInt();              // to avoid above conversion of string into integer 
		System.out.println("ab   ---"+ab);
		
		// to input many numbers\
		System.out.println("enter many numbers");
		int total = 0;
		while(input.hasNextInt()) {
			total = total+input.nextInt();
			
		}
		
         System.out.println("total   = "+total);
         System.out.println("input many text");
         
         
        String temp = "" ;
        while (input.hasNext()) {
        	
        	temp = input.next();
        	
        	if (temp.equals("exist")) break;
        	
        	}
        	System.out.println(" out of loop");
        	
        	
        }
         
            
         
	}
	          
	      
	


