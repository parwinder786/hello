package Study3;

public class Practise {

	
	
	
	private int a = 10;
	private int b =22;
	
	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	void method(int a) {
		if(a>10) {
			this.a=a;
		}else {
			this.a=0;
			System.out.println("a is value should be greater than 10");
		}
	}
	

	int addition () {
		int c = a+b;
		
		System.out.println(c);
		return c;
	}
}
