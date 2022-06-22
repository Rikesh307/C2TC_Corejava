package corejava_package1;

import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> ll=new LinkedList<String>();  
         ll.add("Ravi");  
         ll.add("Vijay");  
         ll.add("Ajay");  
         ll.add("Anuj");  
         ll.add("Gaurav");  
         ll.add("Harsh");  
         ll.add("Virat");  
         ll.add("Gaurav");  
         ll.add("Harsh");  
         ll.add("Amit");  
         System.out.println("Initial list of elements: "+ll);  
       ll.remove("Vijay");
       System.out.println("after invoing remove (object) method :"+ll);
       ll.remove(0);
       System.out.println("after invoing remove (index) method :"+ll);
       
       LinkedList<String> ll2 =new LinkedList<String>();
       ll2.add("Ravi");
       ll2.add("Hanumat");
       ll.addAll(ll2);
       System.out.println("updated list:"+ll);
       ll.removeAll(ll2);
       System.out.println("after invoking remove all()method:"+ll);
       ll.removeFirst();
       System.out.println("After invoking removeFirst() method:"+ll);
       ll.removeLast();  
       System.out.println("After invoking removeLast() method: "+ll);  
   //Removing first occurrence of element from the list  
       ll.removeFirstOccurrence("Gaurav");  
       System.out.println("After invoking removeFirstOccurrence() method: "+ll);  
   //Removing last occurrence of element from the list  
       ll.removeLastOccurrence("Harsh");  
       System.out.println("After invoking removeLastOccurrence() method: "+ll);  

       //Removing all the elements available in the list       
       ll.clear();  
       System.out.println("After invoking clear() method: "+ll);   
	}

}
