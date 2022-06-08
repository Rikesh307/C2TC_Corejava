package corejava_package;

public class WithoutException {

	public static void main(String[] args) {         
		int d = 0;
		int a;
		try
		{
			a = 42/d;
			System.out.println("Will not be printed.");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero is not acceptable.");
			a = 42/d;
			System.out.println("This will get printed.");
		}
		}}