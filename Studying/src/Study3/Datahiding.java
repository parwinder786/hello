package Study3;

public class Datahiding {

	
	private double salary;             //private will block the access to salary so now private is (salary is accessble inside the class
	double bonus;
	
	
	                                      public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}                                         




	//void is default modifier which accessble in the package
	void setsalary(double salary) {
		if(salary>=40000 && salary <=200000) {
			this.salary=salary;
		}else {
			this.salary=0;
			System.out.println("please check you salary");
		}
	}
	
	
     public double getsalary() {
    	 return salary;                                  // to print or retuen a salary in accessing class getsalary method is addeed 
     }
       void calculatepay() {
		
		double pay = salary+bonus;
		System.out.println("salary   is " +pay);
		
}
}
