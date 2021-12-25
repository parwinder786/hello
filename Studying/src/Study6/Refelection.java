package Study6;

public class Refelection {
	
	double salary;
	int age;
	String Department;
	public void assign(double sal, int age, String dept) {
		this.salary = sal;
		this.age = age;
		this.Department = dept;
		
	}
           public double calaulateTax() {
        	   return salary*.30;
           }
}
