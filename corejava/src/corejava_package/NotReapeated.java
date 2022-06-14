package corejava_package;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class NotReapeated {
	private static final String Integer = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
		ar[i] = scan.nextInt();
		}
		HashMap<Integer, Integer> h = new HashMap<Integer,

		Integer>();

		for (int i = 0; i < ar.length; i++) {
		if(h.containsKey(ar[i])) {
		Integer v = h.get(ar[i]);
		h.put(ar[i], v+1);
		}
		else {
		h.put(ar[i], 1);
		}
		}
		int sum = 0;
		for (Map.Entry entry : h.entrySet()) {
			if((int)entry.getValue() == 1) {
			sum += (int)entry.getKey() ;
			}
			}
			System.out.println(sum);
	}

}
