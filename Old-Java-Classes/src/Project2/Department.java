package Project2;

import java.util.ArrayList;
import java.util.List;

import Project.Employee;

public class Department {
	private String deptname;
	private double budget;
	//private Employee[] emps = new Employee[5];
	private List<Employee> emps = new ArrayList<>();
	
	
	private int counter = 0;
	
	public Department(String deptname){
		this.deptname = deptname;
		this.budget = 50000;		
	}	
	 public void addEmployee(Employee obj){
		 emps.add(obj);
		 counter++;
		 
		 if (obj.getGrade()>=5){
			 this.budget += 150000;
			 
		 }else{
			 this.budget += 100000;
			 
		 }
	 }
			public void describe(){
				String temp = "dept name " + this.deptname
				+ "\nbudget : " + this.budget
				+ "\nEmployees : ";
				
				for (Employee x : emps){
					//if (x != null){
					//temp += x.toString(); --bydefault to string method called
					temp+= x + " ";
					
					
				//}
					System.out.println(temp);	
			}


			}		
		
	 }


