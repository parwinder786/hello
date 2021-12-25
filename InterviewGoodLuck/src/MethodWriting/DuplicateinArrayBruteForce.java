package MethodWriting;

public class DuplicateinArrayBruteForce {
	
	public static void duplicate(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println("the duplicate found = "+arr[i]);
				}
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] abc= new int [] {2,3,5,6,7,3,4,8,2};
        duplicate(abc);
	}

}
