package Study3;

public class Testgettingsetters {

	public static void main(String[] args) {
		
		GettingSetters ab = new GettingSetters ();
		
		
		
		ab.setsalary(100000);
	//	ab.bonus = 200;                            // bonus is accessble afer getters and setters 
		ab.setBonus(444);
		ab.calculatepay();

		System.out.println(ab.getsalary());
		System.out.println(ab.getBonus());

	}

}
