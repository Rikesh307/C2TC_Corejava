package corejava_package;

//Calling default constructor from parameterized constructor:

class AB{  
AB()//default constructor
{
	System.out.println("hello a");
	}  
AB(int x){  
this();  
System.out.println(x);  
}  
}  
class Constructors_examp1{  
public static void main(String args[]){  
AB a=new AB(10);  //parameterized constructor
}}  
