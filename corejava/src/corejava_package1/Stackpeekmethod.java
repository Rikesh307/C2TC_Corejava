package corejava_package1;

import java.util.Stack;

public class Stackpeekmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stk= new Stack<>();  
		
		// pushing elements into Stack  
		
		stk.push("messi");  
		stk.push("neymar");  
		stk.push("kante");  
		stk.push("rikesh");  
		System.out.println("Stack: " + stk); 
		
		// Access element from the top of the stack  
		
		String players = stk.peek();  
		
		//prints stack  
		
		System.out.println("Element at top: " + players);  
	}

}
