package ThompsonReuters;

public class Casewire2 {
	


       public int sumThePositive(int[] Array){
           int temp=0;
	      for(int i=0;i<Array.length;i++){
	        if(Array[i]>0)
		{
		   temp=temp+Array[i];
		}
	 }
	      System.out.println(temp);
	 return temp;
}


	public static void main(String[] args) {
		
		              int arry[]= {1,2,3,4,5};
		              
		              
                         Casewire2 obj = new Casewire2();
                        obj.sumThePositive(arry);
		
                
	}

}
