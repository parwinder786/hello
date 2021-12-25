package MethodWriting;

public class SumOfArray {
	
	  static void sumvalue(int array[]) {
		  
		        int sum =0;
		        
		        for(int i=0;i<array.length;i++) {
		        	
		        	sum=sum+array[i];
		        	
		        	
		        }
		          System.out.println(sum);
	  }
	

	public static void main(String[] args) {
		
		        int array[] = {1,2,3,4};
		         SumOfArray.sumvalue(array);

	}

}
