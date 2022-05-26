package corejava_package;
import java.util.Scanner;

public class Checktoken {

	public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
System.out.println("Enter an integer");
boolean b = reader.hasNextInt();
System.out.println("you entered an integer : " +b );
	}

}
