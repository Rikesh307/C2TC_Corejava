package corejava_package;
public class Staticmethod {
	static int j = 100;
	int n = 200;
	static void a()
	{
		int a = 200;
		System.out.println("print from a");
//	n = 100;
//	a2();
	//System.out.println(super.j);
	}
        void a2()
        {
        	System.out.println("inside a2");
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticmethod ob1 = new Staticmethod();
	    ob1.a2();
	    Staticmethod.a();
	}

}
