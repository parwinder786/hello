package SampleProject;

public class Department {
              private String deptname;
              private double budget;
                                                                 //association of emplyee in department
              
             private  Employee [] emps= new Employee[2];
             
              private int counter = 0;
              
              
              
              
              public Department(String deptname) {
				
				this.deptname = deptname;
				this.budget = 50000;
			}
			
              public void addemployee(Employee obj) {
            	  emps[counter]= obj;
            	  counter++;
            	  
            	  if (obj.getGrade()>=5) {
            		  this.budget +=150000;
            	  }else {
            		  this.budget =+100000;
            	  }
            	  
              }
              public void describe() {
            	  String temp ="dept name: " + this.deptname + "budget  = "+this.budget;
            	  System.out.println(temp);
              }
               
              
}
