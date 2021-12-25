
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int array[] = {1,33,-9,22,99,12};
               
               for(int lastsortedindex = array.length -1; lastsortedindex>0;lastsortedindex--) {
            	   
            	  for (int i=0; i<lastsortedindex;i++) {
            		  if(array[i] > array[i + 1]) {
            			  
            			  swap(array, i , i + 1);
            		  }
            		  
            	  }
            	  
               }	
               
               for(int i =0;i<array.length;i++) {
            	   
            	   System.out.println(array[i]);
               }
	}

	public static void swap(int []arr, int i, int j) {
		if(i==j) {
			return;
		}
		
		int temp = arr[i];  //temp will have a[i] e.g 3
		arr[i] = arr[j];   //arr[i] will have arr[j] = 2
		arr[j] =temp;   //arr [j] will have value of temp arr[i]=3
		//poistions of i & j will be changed now
			
	}	
}
