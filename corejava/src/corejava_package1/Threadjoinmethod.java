package corejava_package1;

public class Threadjoinmethod extends Thread {
	public void run(){    
		  for(int i=1;i<=5;i++){    
		   try{    
		    Thread.sleep(500);    
		   }catch(Exception e){System.out.println(e);}    
		  System.out.println(i);    
		  }    
		 }    
		public static void main(String args[]){    
			 Threadjoinmethod t1=new  Threadjoinmethod();    
			 Threadjoinmethod t2=new  Threadjoinmethod();    
			 Threadjoinmethod t3=new  Threadjoinmethod();    
		 t1.start();    
		 try{    
		  t1.join();    
		 }catch(Exception e){System.out.println(e);}    
		    
		 t2.start();    
		 t3.start();    
		 
}
	}