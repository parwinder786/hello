
public class SelectionSort {

	
	public static void main(String[] args) {
		
		int [] inarray = {10,-15,44,6,7};
		
		for(int lastunsorted = inarray.length -1; lastunsorted >0; lastunsorted--) {
			
			int largest =0;
			
			for(int i=1; i<=lastunsorted;i++) {
				
				if(inarray[i]>inarray[largest]) {
					largest=i;
				}
				
			}
			swap(inarray,largest,lastunsorted);
						
		}
				
		for(int i =0; i<inarray.length;i++) {
			System.out.println(inarray[i]);
		}
	}
		
	public static void swap(int []arr, int i , int j) {
		
		   if(i==j) {
		    	return ;
		    	}
		   
		    int temp= arr[i];
		    arr[i]=arr[j];
		    arr[i]=temp;
	}
}
