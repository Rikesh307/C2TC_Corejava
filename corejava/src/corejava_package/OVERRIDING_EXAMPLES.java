package corejava_package;
class A{
	void run()
	{
		System.out.println("hi");
		
	}
}
   class B extends A {
	void run()
	{
		System.out.println("hello");
	}
}

public class OVERRIDING_EXAMPLES {
	public static void main(String args []) {
	A a = new A();
	B b = new B();
	a.run();
	b.run();
	}
}
