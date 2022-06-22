package corejava_package1;

public class threadexample extends Thread {
	 public void run()  
     {    
        int a= 10;  
        int b=20;  
        int result = a+b;  
        System.out.println("dayanand");  
        System.out.println("Sum of two numbers is: "+ result);  
     }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating instance of the class extend Thread class  
        threadexample t1 = new  threadexample();  
        //calling start method to execute the run() method of the Thread class  
        t1.start();  
	      
	}

	
	}


