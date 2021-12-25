package Project2;

public class Employee {
	 private String empname;
	 private int  grade; 
	 
	 public int getGrade() {
		return grade;
	}
	public Employee(String empname , int grade){
		 this.empname  = empname;
		 this.grade = grade;
		 		 
	 }
	/*public String getEmpINfo(){
		return empname + "(" + grade + ")" ;
		*/
	public String toString(){
		return empname + "(" +grade+")";
		
	}

}
