package Project2;

import Project.Department;
import Project.Employee;

public class Testdataa {
		public static void main(String[] args) {
			Employee alex = new Employee("alex rod ", 6);
			Employee linda = new Employee("linda ", 7);
			Employee john = new Employee("john doe ", 3);
			Employee sara = new Employee("sara time ", 4);
			Employee james = new Employee("james doe ", 4);
			
			Department sales = new Department("xyz sales");
			Department IT = new Department("xyz IT");
			
			
			sales.addEmployee(alex);
			sales.addEmployee(linda);
			sales.addEmployee(john);
			
			IT.addEmployee(sara);
			IT.addEmployee(james);
			sales.describe();
			IT.describe();
			
			

	}

}
