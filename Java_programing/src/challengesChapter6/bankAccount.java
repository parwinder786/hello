package challengesChapter6;

public class bankAccount {

	// TODO Auto-generated method stub

	private int accountNumber, balance, phoneNumber;
	private String customerName, email;

	public int depoistFunds(int depoistFund) {
		balance = balance + depoistFund;
		return balance;
	}

	public void withdrawFunds(int withdrawfund) {
		if (withdrawfund < balance) {
			balance = balance - withdrawfund;
			System.out.println("only " + balance + " is available after the Withdrwal");
			// return balance;
		} else
			System.out.println("Insufficent Funds");
		// return 0;

	}
}
