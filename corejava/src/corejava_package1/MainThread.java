package corejava_package1;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread daya = Thread.currentThread();
		System.out.println("Current Thread is:"+daya);
		System.out.println("Name of Current Thread is "+daya.getName());
		
		daya.setName("dayanand");
		daya.setPriority(5);
		
		
		System.out.println("After Changing name "+daya);
		
		System.out.println(daya.getName());
	}

}
