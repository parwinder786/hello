package Study6;

public class InterfaceOne implements InterfaceOffice {
	                                       
	                                         //// in case of interface class use implement instead of extends 
	                                            // it will give error becoz method name are different than interface 
	                                           //so mouse over and  select unemplement mehod 
	
	public void New () {
    	System.out.println("world new .xls");
    }
    public void open() {
    	System.out.println("world new .xls");
    }

     public void save() {                     //method names chnaged accodianlgly to interface after getting error saveExcel to save
    	 System.out.println("world new .xls");      //open excel to open anf newexcel to new
    	
    	 // it will give error becoz method name are different than interface 
         //so mouse over and  select unemplement mehod
    	 
    	 
    	// or we can chnage the method name as its interface
     }
   /*  
	@Override
	public void New() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}*/
     
}
