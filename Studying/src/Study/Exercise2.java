package Study;

public class Exercise2 {

	public static void main(String[] args) {
	  /*int [] nums = {10, 20, 30, 40};
	  int total=0;
	  
	                                                    // to add the string arry 
	  for(int temp:nums) {
		 total = total+temp;
	  }
       System.out.println(total);*/
		
		
		String [] nums = {"10","20","30","40"};
		int total=0;
		for (String temp:nums) {
			total= total+Integer.parseInt(temp);              //use of wrapper classes to convert string into arry
			
		}
		
		System.out.println("total "+ total);
		
	}

}
