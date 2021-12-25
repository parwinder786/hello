package Study6;

public class Encapuslation {

	 public int accno =1234;
	// public int pinno=11;
	                             //making private 
	 private int pinno =11;
	 
	// public double balance=1000;
	 private double balance=1000;   //cant access directly outside 
	 
	 
	 
	  public double getBalance() {
		return balance;                     //setting setter & getters by right click on emplty space
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public void setPinno(int pinno) {
		this.pinno = pinno;
	}

	public void withdraw(int accN, int pin, int amount) {
		  
		  
		  if (accN==accno && pin==pinno) {
			  
			  if(amount<balance) {
				  
				  balance=balance-amount;
				  System.out.println("amount withdrawal == "+amount);
				  System.out.println("balance after withdrwal "+balance);
				  
			  }else{
				  System.out.println("insufficent balance");
			  }
			  
		  }else{
			  System.out.println("incorrect or invalid credentials");
		  }
	  }
	 
                public void updatepin(int accNo, int oldpinn, int newpin) {
                	if(accNo==accno && oldpinn==pinno) {
                		pinno=newpin;
                		System.out.println("pin chnaged successfully");
                		
                	}else {
                		System.out.println("invalid credentials");
                	}
                	
                }


               public double depoist(int accNo,int pin, double amount ) {
            	   if (accNo==accno && pin==pinno) {
            		   balance=balance+amount;
            		   return balance;                    //setting return types
            	   }else {
            		   System.out.println("invalid credentials");
            		   return balance;
            	   }
            	   
               }
}
