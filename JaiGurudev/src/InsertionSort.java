
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] inarray = {20,27,-9,55,6,7,3};
		
		for(int firstunsortedindex =1; firstunsortedindex< inarray.length; firstunsortedindex++) {
			int newelement = inarray[firstunsortedindex];
			int i;
			
			for(i =firstunsortedindex; i >  0 && inarray [i-1] > newelement;i--) {
				inarray[i]=inarray[i-1];
				
			}
			   inarray[i]=newelement;
		}
             for(int i =0;i<inarray.length;i++) {
            	 System.out.println(inarray[i]);
            	 
            	 
            	 
            	 
             }
	}

}
