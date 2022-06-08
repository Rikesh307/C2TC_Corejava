package corejava_package;

public class Trycatchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Str = null;
try {
	Str.equals("hello");
}
catch(NullPointerException ne) {
	Str = new String ("hello");
}
	System.out.println("contuining in the program");
}
	}

