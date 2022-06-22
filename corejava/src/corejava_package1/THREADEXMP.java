package corejava_package1;

public class THREADEXMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread daya = Thread.currentThread();
		System.out.println("Thread is:"+daya);
		System.out.println("Name of Thread is "+daya.getName());
		
		daya.setName("dayanand");
		daya.setPriority(5);// greater than 10 is not acceptable
		
		System.out.println("After Change "+daya);
		
		System.out.println(daya.getName());
	}

}
