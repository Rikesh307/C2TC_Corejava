package corejava_package;
class Ama{  
String color="white";  
}  
class Dog10 extends Ama{  
String color="black"; 
void PrinttColor(){  
System.out.println(color);  
System.out.println(super.color);
}  
}  

public class Superkeyword_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog10 d=new Dog10();  
		d.PrinttColor();  
	}

}
