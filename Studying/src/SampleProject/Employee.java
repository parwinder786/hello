package SampleProject;

public class Employee {
	
	private String empname;                            
     private int grade;
     
     
     public int getGrade() {
		return grade;                                //setter and getters to use grade in department class
	}


	public Employee(String empname, int grade) {
    	 this.empname= empname;                            //use of constructot
    	 this.grade = grade;
    	 
     }

}
