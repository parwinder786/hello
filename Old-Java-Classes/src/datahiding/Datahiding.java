package datahiding;

public class Datahiding {
	private double salary;
	private double bonus;
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	void setsalary(double salary){
	if(salary >=40000 && salary<=200000){
    this.salary = salary;
	}else {
	this.salary = 0;
	System.out.println("please check salarry");
			}
	}
	public double getsalary(){
		return salary;
	
	
	}
	public void calculatetotalpay(){
	double totalpay = salary + bonus;
	System.out.println(totalpay);
		
		}	
	}
	


