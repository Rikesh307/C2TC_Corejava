package corejava_package;
import java.util.Scanner;
public class Library {
	int acc_num;
	String title;
	String author;

	void input() {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the book title:");
		title = sc.nextLine();
		System.out.println("enter author:");
		author = sc.nextLine();
		System.out.println("enter acc_num:");
		acc_num = sc.nextInt();
	}
	void compute() {
		Scanner ab = new Scanner(System.in);
		System.out.println("enter the num of late days:");
		int days = ab.nextInt();
		int fine = days *5;
		System.out.println("fine = Rs." + fine);
	}
	 void display() {
		 System.out.println("Accession Number\tTitle\tAuthor");
	        System.out.println(acc_num + "\t\t" + title + "\t" + author);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library obj = new Library();
		obj.input();
		obj.compute();
		obj.display();
		
	}

}
