package corejava_package;
import java.util.Scanner;
import java.util.*;
public class userinput {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter your name :");
	String name = sc.next();
    System.out.println("enter your marks : ");
    float mar = sc.nextFloat();
    System.out.println("enter you id: ");
    int ID = sc.nextInt();
    char c = sc.next().charAt(3);
    System.out.println("c = " +c);
	}

}
