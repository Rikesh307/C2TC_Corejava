package corejava_package;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        String ans ="";
	        if(n%2 == 1) {
	        	ans ="weired";
	        }else {
	        	if(n>=6 && n<=20) {
	        		ans = "weired";
	        	}else {
	        		ans = "not weired";
	        	}
	        }
	        
	    System.out.println(ans);
	    sc.close();
	     
	}
}
