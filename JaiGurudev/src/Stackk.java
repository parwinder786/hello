import java.util.Stack;

import STack.ArrayStack;

public class Stackk {

	public static void main(String[] args) {
           	
		 Stack<String> stk = new Stack<String>();
		 
		 
		 
		 stk.push("ahaha");
		 stk.push("h");
		 stk.push("a");
		 stk.push("aha");
		 
		 
		 System.out.println(stk);
		 System.out.println(stk.peek());
		
		 
		 System.out.println(stk.pop());
		 System.out.println(stk.peek());
		 
		 System.out.println(stk.isEmpty());
		 
		 
	}

}
