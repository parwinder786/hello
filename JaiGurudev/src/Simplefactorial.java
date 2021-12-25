
public class Simplefactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Simplefactorial.fact(3);
		
	
	}


    public static void  fact(int num) {
		
		
		if(num==0) {
			//return 1;
			System.out.println("the num is zero"+num);
		}
		int fl =1;
		for(int i =1;i<=num;i++) {
			fl= fl*i;
		}
		//return fl;
		System.out.println(fl);
	}
}
