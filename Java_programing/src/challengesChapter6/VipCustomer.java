package challengesChapter6;

public class VipCustomer {

	private String name, emailAddress;
	private double limit;

	// create a constructor from source tab

	// constructor is created same way without any parameters

	public VipCustomer() {
		this("Defaultname", "default@email.com", 444.01);
	}

	// create a 2nd constructor from source tab after selecting the values
	public VipCustomer(String name, double limit) {

		/*
		 * this.name = name; this.limit = limit;
		 */
		this(name, "Unknownemail.com", limit);

	}

	// 3rd constructor is saving the values
	public VipCustomer(String name, String emailAddress, double limit) {

		this.name = name;
		this.emailAddress = emailAddress;
		this.limit = limit;
	}

	//create the 3 getters from source tab
	
	public String getName() {
		return name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public double getLimit() {
		return limit;
	}

}
