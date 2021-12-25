package Study3;

public class GettingSetters {

	
	
	private double salary;             
	private double bonus;        //bonus is chnages tp private is right click on bonus then go to source and getters and setters
	
	
	

	public double getBonus() {
		return bonus;
	}
                                       //right click on bonus and source and generate getters and setters

	public void setBonus(double bonus) {
		this.bonus = bonus;
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

