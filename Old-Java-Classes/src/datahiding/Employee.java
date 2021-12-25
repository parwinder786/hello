package datahiding;

public class Employee {

	public static void main(String[] args) {
		
	Datahiding alex = new Datahiding();
	alex.setsalary(100000);
	alex.setBonus(2000); 
	alex.calculatetotalpay();
	System.out.println(alex.getsalary());
	

	}

}
