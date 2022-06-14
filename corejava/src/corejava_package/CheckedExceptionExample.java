package corejava_package;
import java.io.*;

class CheckedExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  FileInputStream file_data = null;  
	        file_data = new FileInputStream("C:/Users/ajeet/OneDrive/Desktop/Hello.txt");  
	        int m;  
	        while(( m = file_data.read() ) != -1) {  
	            System.out.print((char)m);  
	        }  
	        file_data.close();  
	}

}

//In the above code, we are trying to read the Hello.txt file and display its data or content on the screen. The program throws the following exceptions:

//1.The FileInputStream(File filename) constructor throws the FileNotFoundException that is checked exception.
//2.The read() method of the FileInputStream class throws the IOException.
//3.The close() method also throws the IOException.
