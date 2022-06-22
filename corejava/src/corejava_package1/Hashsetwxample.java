package corejava_package1;
import java.util.*;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashsetwxample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		set.add("java");
		set.add("python");
		set.add("c++");
		set.add("java");
		System.out.println(set);
		set.add("javascript");
		System.out.println(set);
		Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next()); 
}
}
	}