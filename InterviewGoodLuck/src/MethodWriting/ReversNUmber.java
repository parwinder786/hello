package MethodWriting;

public class ReversNUmber {
	
	
	
	        public static void  reverseno(int num) {
	        	
	        	//int result =0;
	        	int result=0;
	        	
	        	while (num>0) {
	        		
	        		
	        		//result = result*10+num%10;    //4     3
	        		result = result*10+num%10;
	        		
	        		num=num/10;                    //123        12
	        		
	        		
	        	}
	        
	        	System.out.println(result);       //4  
	        }
	
	

	public static void main(String[] args) {
	
		ReversNUmber.reverseno(1234);
		//System.out.println(1234%10);  //if you use % modulas then you will get the last no 
		//System.out.println(1234/10);   // if you divide then you will get first three 12		

	}

}
