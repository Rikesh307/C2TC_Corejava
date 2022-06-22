package corejava_package1;

import java.util.Stack;

public class Stacksearchmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stack<String> stk = new Stack<>();
     stk.push("mac book");
     stk.push("dell");
     stk.push("hp");
     stk.push("lonovo");
     System.out.println("stack:"+stk);
     int location = stk.search("hp");  
     System.out.println("Location of lonovo: " + location);  

	}

}
