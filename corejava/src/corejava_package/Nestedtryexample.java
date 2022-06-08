package corejava_package;

public class Nestedtryexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str = "welcome";
   int x[]= {0,1,2,3,4};
   try//outer try block
   {
	   int slength = str.length();
	   System.out.println("String length:"+slength);
	   
	   try//inner try block
	   {
		   int y=6;
		   System.out.println(x[y]);//exception occured
	   }
	   catch (ArithmeticException e)//no match is found.
	   {
		   System.out.println("Exception is thrown");
		   System.out.println(e.toString());
	   }
   catch(ArrayIndexOutOfBoundsException ae)// match found.
   {
	   System.out.println("Exception is thrown");
	 System.out.println(ae.toString());
   }
   System.out.println("im out of catch block");
   }
}
