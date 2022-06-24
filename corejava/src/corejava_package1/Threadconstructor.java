package corejava_package1;

 class Threadconstructor implements Runnable {
	 public void run()
	 {
		 System.out.println("Hello");
		 try {
			 Thread.sleep(2000);
		 }
			catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		 System.out.println("java");
		 System.out.println(Thread.currentThread());
	 }
	 void m1() {
		 System.out.println("m1 method");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadconstructor a = new Threadconstructor();
		Thread t = new Thread(a, "Child");
		 t.start();
		 System.out.println("Number of active threads: " +Thread.activeCount());
		 a.m1();
	}

}
