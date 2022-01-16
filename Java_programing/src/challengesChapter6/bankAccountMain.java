package challengesChapter6;

public class bankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bankAccount obj = new bankAccount();
		System.out.println("the new balance after the deposit is = " + obj.depoistFunds(4));

		System.out.println("the new balance after the deposit is = " + obj.depoistFunds(6));

		obj.withdrawFunds(4);

	}

}
