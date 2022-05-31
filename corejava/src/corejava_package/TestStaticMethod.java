package corejava_package;
//Java Program to demonstrate the use of a static method.  
class Student10{  
   int rollno;  
   String name;  
   static String college = "ITS";  
   //static method to change the value of static variable  
   static void change(){  
   college = "SEACET";  
   }  
   //constructor to initialize the variable  
   Student10(int r, String n){  
   rollno = r;  
   name = n;  
   }  
   //method to display values  
   void display(){System.out.println(rollno+" "+name+" "+college);}  
}  
//Test class to create and display the values of object  

public class TestStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student10.change();//calling change method  
	    //creating objects  
	    Student10 s1 = new Student10(111,"Karan");  
	    Student10 s2 = new Student10(222,"Aryan");  
	    Student10 s3 = new Student10(333,"Sonoo");  
	    //calling display method  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	}

}
//class A{                           //compilation error 
	// int a=40;//non static  
	   
	// public static void main(String args[]){  
	  //System.out.println(a);  
	// }  
//	}  