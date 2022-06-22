package corejava_package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToarrayexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> places = new ArrayList<>();    
		 places.add("manag");    
		 places.add("Banaras");    
		 places.add("Aparpali");    
		 places.add("Strughan");    
		 //Converting ArrayList to Array  
		 String[] array = places.toArray(new String[places.size()]);    
		 System.out.println("Printing Array: "+Arrays.toString(array));  
		 System.out.println("Printing List: "+places);  
		
		}  
	}

