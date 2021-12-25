
public class Iterativerecrusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recrusive(3));
		

	}

	public static int recrusive(int num) {
		if (num==0) {
			return 1;  // if num==0 is not metioned then it will execute for infinity time
			//other wise you will get stack overflow exception.. out of memory 
		}
		return num * recrusive(num-1);
	}

    public static int iterativefact(int num) {
		
		
		if(num==0) {
			return 1;
			
		}
		int fl =1;
		for(int i =1;i<=num;i++) {
			fl= fl*i;
		}
		return fl;
		
	}
}
