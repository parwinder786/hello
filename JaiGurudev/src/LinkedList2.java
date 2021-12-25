import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LinkedList ll = new LinkedList();
	 LinkedList ll = new LinkedList();
	  ll.add("F");
      ll.add("B");
      ll.add("D");
      ll.add("E");
      ll.add("C");
      System.out.println("to check the add method"+ll);   //add method add in the last so add first will add in first 
      
      ll.addLast("Z");
     
      ll.addFirst("A");
      ll.add(1, "A2");
      System.out.println("Original contents of ll: " + ll);
		 
      // remove elements from the linked list
      ll.remove("F");
      ll.remove(2);    // remove will remove the last element from the list
      System.out.println("Contents of ll after deletion: " + ll);
      
      ll.removeFirst();
      ll.removeLast();
      
      System.out.println("ll after deleting first and last: " + ll); 
      
      LinkedList<Integer>lis = new LinkedList<Integer>();
      lis.add(44);
      lis.add(33);
      
      lis.addFirst(2);
      
      lis.addLast(4);
      
      
      System.out.println(lis);
      
      lis.remove();
      
      System.out.println(lis);
      
      
      
      
      
	}

}
