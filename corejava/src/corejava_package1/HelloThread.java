package corejava_package1;

public class HelloThread extends Thread {
public void run()
{
	System.out.println("hello");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread th = new HelloThread();
th.start();
th.run();
	}

}
