package corejava_package;
//Example 2: Throwing Checked Exception

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throwtest2 {
	//function to check if person is eligible to vote or not
	public static void method()throws FileNotFoundException{
		FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
		BufferedReader fileInput = new BufferedReader(file);
		throw new FileNotFoundException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
		}
catch (FileNotFoundException e) {
	e.printStackTrace();
}
		System.out.println("rest of the code");
	}

}
