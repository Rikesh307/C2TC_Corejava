package corejava_package1;
import java.util.*;

public class Arraytolistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[]array={"java","python","c++","c"};
        System.out.println("Printing Array: "+Arrays.toString(array));
      //Converting Array to List  
        List<String> list=new ArrayList<String>();  
        for(String lang:array){  
        list.add(lang);  
        }  
        System.out.println("Printing List: "+list);  
        
	}

}
