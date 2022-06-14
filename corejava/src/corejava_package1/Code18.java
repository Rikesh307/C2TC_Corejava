package corejava_package1;

public class Code18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=8;
       boolean isPrime =true;
       for (int i=2;i<num/2;i++) {
    	   if(num%i==0)
    	   {
    		   isPrime = false;
    	   }
       }
    	   if(isPrime==true) {
    		   System.out.println("the num is a prime number");
    	   }
    	   else {
    		   System.out.println("the num is not a prime number");
	}

}}
