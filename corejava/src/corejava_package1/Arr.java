package corejava_package1;

public class Arr {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[]arr= new int[] {3,2,4,0};
				
			 
			int max= arr[0];

			for (int i = 0; i<arr.length; i++) {
				if(arr[i]>max)
				max = arr[i];

	}
	 System.out.println("max value element:" +max);		
	}

}
