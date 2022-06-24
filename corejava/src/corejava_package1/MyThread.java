package corejava_package1;

public class MyThread extends Thread {
String task;
MyThread(String task){
	this.task = task;
}
public void run() {
	for(int i=1;i<=10;i++) {
		System.out.println(task+":"+i);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread th1 = new MyThread("cut the ticket");
MyThread th2 = new MyThread("show your seat number");

Thread t1= new Thread(th1);
Thread t2= new Thread(th2);

t1.start();
t2.start();
	}

}
/*1. In the preceding example program, we have created two threads on two objects of MyThread class. Here, we created two objects to represent two tasks.

When we will run the above program, the main thread starts running immediately. Two threads will generate from the main thread that will perform two different tasks.

2. When t1.start(); is executed by JVM, it starts execution of code inside run() method and print the statement “Cut the ticket” on the console.

3. When JVM executes Thread.sleep(1000); inside the try block, it pauses the thread execution for 1000 milliseconds. Here. sleep() method is a static method that is used to pauses the execution of thread for a specified amount of time.

For example, Thread.sleep(1000); will pause the execution of thread for 1000 milliseconds (1 sec). 1000 milliseconds means 1 second. Since sleep() method can throw an exception named InterruptedException, we will catch it into catch block.

4. Meanwhile, JVM executes t2.start(); and second thread starts execution of code inside the run() method almost simultaneously. It will print the statement “Show your seat number”. Now, the second thread will undergo to sleep for 1000 milliseconds.


 
5. When the pause time period of the first thread is elapsed, it will reenter into running state and starts the execution of code inside run() method. The same process will also happen for second thread. In this manner, both threads will perform two tasks almost simultaneously.

Note: 

1. In the above output, you will notice that the program is displaying two messages “Cut the ticket” and “Show your ticket” in shuffled manner.

This is because the CPU shares time between two threads. CPU executes the run() method of t1 for time slice and prints one message.

Meanwhile, CPU control goes to execute the run() method of t2 for next time slice and prints the second message. This process goes on.

2. The process of allotting time slots to threads is called time slice.

Therefore, we can say that thread behavior is unpredictable in Java. When you will run code second time, you may get different output.*/