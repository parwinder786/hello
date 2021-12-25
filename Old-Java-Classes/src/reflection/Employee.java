package reflection;

public class Employee {
                 double salary;
                 int age;
                 String department;
                public void assign(double sal, int age, String dept){
                	this.salary = sal;
                	this.age = age;
                	this.department = dept;
                	
                }
                public double calculatetax(){
                	return salary *.30;
                	
                }
                
}
