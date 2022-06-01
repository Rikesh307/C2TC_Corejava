package corejava_package;
interface Printable{  
void print();  
}  
interface Showable{  
void print();  
}  
 class Multiple_inheritance_Interface implements Printable,Showable {
	 public void print(){
		 System.out.println("Hello");
	 } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_inheritance_Interface obj = new Multiple_inheritance_Interface();  
		obj.print();  

	}

}
