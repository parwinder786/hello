package interfaces;

public interface Office {
	public void New();
	public void open();
	public void save();
	//default method will not create any problems for implementation in classes
	//print is new interdouced method
	default void print (){
		System.out.println("print method");
	}
	
	

}
