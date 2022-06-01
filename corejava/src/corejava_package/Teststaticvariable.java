package corejava_package;
class Teachers7{  
	   int rollno;//instance variable  
	   String name;  
	   static String college ="SEACET";//static variable  
	   //constructor  
	   Teachers7(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
	}  
	//Test class to show the values of objects  
	public class Teststaticvariable{  
	 public static void main(String args[]){  
	 Teachers7 s1 = new Teachers7(111,"pratik");  
	 Teachers7 s2 = new Teachers7(222,"ritesh");  
	 //we can change the college of all objects by the single line of code  
	 //Student.college="BBDIT";  
	 s1.display();  
	 s2.display();  
	 }  
	}  