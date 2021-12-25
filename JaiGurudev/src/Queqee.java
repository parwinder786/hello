import java.util.LinkedList;
import java.util.Queue;

public class Queqee {

	public static void main(String[] args) {
		
		
		   Queue  abc = new LinkedList();
		   
		   for (int i=0; i<5; i++) { 
			     abc.add(i);
		   }
		   System.out.println("Elements of queue-"+abc); 
		
		   
		   Object  removedele = abc.remove(); 
		    System.out.println("removed element-" + removedele); 
		  
		    System.out.println(abc); 
		    
		   Object head = abc.peek(); 
		    System.out.println("head of queue-" + head);
		    
		    
	}

}
