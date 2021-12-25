
public class Arrays {

	
	
	public static void main(String[] args) {
		
		int arr [] = new int [7];
		Object array [] = new Object[33];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		
		
		
		int index =0;
		for( int i =0; i <arr.length; i++) {
		
		//System.out.println(arr[i]);	
			if(arr[i]==6) {
				index = i;
				break;				
			}						
		}		
		System.out.println("index = "+index);
				
	}
}
