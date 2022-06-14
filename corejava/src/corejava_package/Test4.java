package corejava_package;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub	
	 Scanner scan = new Scanner (System.in);
int n1 = scan.nextInt();
int n2 = scan.nextInt();

String []ar1 = new String [n1];
String []ar2= new String[n2];

for (int i = 0;i<ar1.length;i++) {
	ar1 [i]=scan.next();
}
for (int i=0;i<ar2.length;i++) {
	ar2[i]= scan.next();
	
}
int res = 0;
for(int i=0;i<ar1.length;i++) {
	if(!ar1[i].equals("blank")&&!ar2[i].equals("blanks")) {
		if(ar1[i].equals(ar2[i])) {
			res+=4;
		}
		else {
			res-=1;
		}
		}
	}
System.out.println(res);
	}
}
					
					
	