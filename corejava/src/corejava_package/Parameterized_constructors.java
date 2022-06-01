package corejava_package;
 class Parameterized_constructors {
	Parameterized_constructors()
	{
		System.out.println("Default constructor");
		
	}
	
	Parameterized_constructors(int i, int j)
	{
		System.out.println("constructors with two parameters"+i+"  "+j);
		
	}
	Parameterized_constructors(int i, int j,int k)
	{
		System.out.println("constructors with three parameters"+i+"  "+j+ "  "+k);
	}
	Parameterized_constructors(int i,String Name)
	{
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized_constructors obj1 = new Parameterized_constructors();
		Parameterized_constructors obj2 = new Parameterized_constructors(10,20);
		Parameterized_constructors obj3 = new Parameterized_constructors(30,40,50);
		Parameterized_constructors obj4 = new Parameterized_constructors(80,"Ritesh");
		
	}

}
