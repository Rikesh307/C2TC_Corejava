package corejava_package;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add("D");
		
		System.out.println("array list is" +arr);
		
		arr.remove(3);
		System.out.println("after removing"+arr);
		

	}

}
