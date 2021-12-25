package SampleProject;

public class Testcompany {

	public static void main(String[] args) {
		
	Employee alex = new Employee ("alex",6);        //use of constructor
	Employee linda = new Employee ("linda",4);
	
	
	
	Department sales = new Department("xyz sales");
	Department IT = new Department("xyz sales");
	
	
	                                     //to debug add toggle point after right clicking and run java application as debug 
	
	
	sales.addemployee(alex);
	
	IT.addemployee(linda);
	
	sales.describe();
	IT.describe();
	
		
		
		

	}

}
