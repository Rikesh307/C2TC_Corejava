package corejava_package1;

public class HelloRunnable implements Runnable {

	public void run()
	{
		System.out.println("hi..");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HelloRunnable hello = new HelloRunnable();
Thread threadobj=new Thread(hello);
threadobj.start();
	}

}
