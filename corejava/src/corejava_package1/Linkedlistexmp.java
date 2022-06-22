package corejava_package1;
import java.util.LinkedList;
public class Linkedlistexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();  
        System.out.println("Initial list of elements: "+ll);  
        ll.add("Rama");  
        ll.add("Vikram");  
        ll.add("Ajay devgan");  
        System.out.println("After invoking add(E e) method: "+ll);  
      //Adding an element at the specific position 
        
        ll.add(1, "saurav");  
        System.out.println("After invoking add(int index, E element) method: "+ll);  
        LinkedList<String> ll2=new LinkedList<String>();  
        ll2.add("monoo");  
        ll2.add("Hanuman");  
      //Adding second list elements to the first list 
        
        ll.addAll(ll2);  
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll); 
        
        LinkedList<String> ll3=new LinkedList<String>();  
        ll3.add("Joe");  
        ll3.add("Ram");  
        //Adding second list elements to the first list at specific position  
        
        ll.addAll(1, ll3);  
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);  
      //Adding an element at the first position  
        
        ll.addFirst("rikesh");  
        System.out.println("After invoking addFirst(E e) method: "+ll);  
        //Adding an element at the last position  
        
        ll.addLast("Harry");  
        System.out.println("After invoking addLast(E e) method: "+ll);  
	}

}
