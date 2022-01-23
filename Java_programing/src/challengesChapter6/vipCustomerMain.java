package challengesChapter6;

public class vipCustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VipCustomer person1= new VipCustomer();
		System.out.println(person1.getName());
		
		VipCustomer person2= new VipCustomer("BOB",25000.0);
		System.out.println(person2.getName());
		
		VipCustomer person3= new VipCustomer("Tim","abc@email.com",222.00);
		System.out.println(person3.getName());
		
		System.out.println(person3.getEmailAddress());

	}

}
