package corejava_package;
//Calling parameterized constructor from default constructor:
class ABC{  
ABC(){  
this(5);  // Para cons
System.out.println("hello a");  
}  
ABC(int x){  
System.out.println(x);  
}  
}  
public class COnstructors_examp2 {
	public static void main(String args[]){  
		ABC a=new ABC(); //default cons 
		}}  
