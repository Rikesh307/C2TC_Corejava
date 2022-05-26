package corejava_package;
class animal{
	void eat() {
		System.out.println("eating food");

	}
}
class Dog extends animal {
	void bark () {
	System.out.println("barking....");	

	}
}
public class Singlelevel_inheritance_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog ();
		d.bark();
		d.eat();
		
   
	}

}
