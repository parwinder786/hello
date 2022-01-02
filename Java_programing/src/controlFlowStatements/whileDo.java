package controlFlowStatements;

public class whileDo {

	public static void main(String[] args) {

		int count = 0;
		while (count != 5) {
			System.out.println("Count Value is " + count);
			count++;

			// while is similar to below for loop
			// for(int i=0;i<5;i++) {
			// System.out.println("Count Value is "+ i);
			// }
			// Or
			// for(count=1;count<5;count++) {
			// System.out.println("Count Value is "+ count);
			// }

		}
		   count =1;
           while(true) {  //if go continously till count =5 & break it out 
        	   if(count==5) {
        		   break;
        	   }
        	   System.out.println("Count Value is "+ count);
        	   count++;
           }
           System.out.println("");
           count =6;
           do {
        	   System.out.println("Count Value is "+ count);
        	   count++;
           }while(count <5);
	}

}
