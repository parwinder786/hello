package Study6;

public class Genericclas <T,S> {    // class is generic now 
	
	//int t;
	T t;
	//String s;
	S s;
	
	public Genericclas(T t, S s) {
		this.t=t;
		this.s=s;
		
	}
	public void printput() {
		System.out.println("the value of T = "+t);
		System.out.println("the value of s = "+s);
	}
	

}
