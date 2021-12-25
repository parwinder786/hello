package genericmethods;

public class Gencalculate <T,S> {
	//does not matter what T and S are..contain data type
	T t;
	S s;
	public Gencalculate(T t, S s)
	{
		//constructor
		this.t = t;
		this.s = s;
		
}
             public void printout()
             {
            	 System.out.println("the value of t = " + t);
            	 System.out.println("the value of s = " + s);
             }
}
