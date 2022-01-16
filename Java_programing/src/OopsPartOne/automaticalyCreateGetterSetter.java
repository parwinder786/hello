package OopsPartOne;

public class automaticalyCreateGetterSetter {

	public automaticalyCreateGetterSetter() {
		this(55.66, "5555", "55555", "hhahah", "abc@gmail.com", "6663435"); // constructor will pass these value to 2nd
																			// constrctor & call
		System.out.println("Empty Constructor called");

		// create the constructor with the same name as class,
		// we can overload the No of constructors with same names

	}

	public automaticalyCreateGetterSetter(Double balance, String accountNumber, String number, String customerName,
			String email, String phoneNumber) {
		System.out.println("Account Constructor with parameters is called");
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.number = number;
		this.accountNumber = accountNumber;
		this.balance = balance;

	}

	public String accountNumber, customerName, email, phoneNumber, number;
	public double balance;

	// after the variable, select the source and click on Generate setters and
	// getters
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
