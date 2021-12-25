package Project;

public class Department {

	
	private String deptname;
	private double budget;
	private Employee[] emps = new Employee[5];
	private int counter = 0;
	
	public Department(String deptname){
		this.deptname = deptname;
		this.budget = 50000;		
	}	
	 public void addEmployee(Employee obj){
		 emps[counter] = obj;
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
					if (x != null){
					temp += x.getEmpINfo();
					
				}
					System.out.println(temp);	
			}


			}		
		
	 }
		

