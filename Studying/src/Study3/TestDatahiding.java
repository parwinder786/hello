package Study3;

public abstract class TestDatahiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datahiding ab = new Datahiding ();
		
		//ab.salary =1111;      //cant access the salary because its private in class datahiding
		                   
		//ab.setsalary(50000);         //set salarty is accesssble because its default modifier in class datahding 
		
		ab.setsalary(100000);
		ab.bonus = 200;
		ab.calculatepay();
		
		//System.out.println(ab.salary);           we cant print salary because salary is private in datahiding class
		System.out.println(ab.getsalary());
		
	}

}

