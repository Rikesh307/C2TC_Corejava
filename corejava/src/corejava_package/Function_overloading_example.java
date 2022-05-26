package corejava_package;
class simpleCalculator{
void prnsqr(int i) {
	System.out.println("square of integer "+i+"is"+i*i);
}
void prnsqr (float f) {
	System.out.println("square of float"+f+"is"+f*f);
}
}
public class Function_overloading_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
simpleCalculator obj = new simpleCalculator();
obj.prnsqr(5);
obj.prnsqr(3);

	}
}
