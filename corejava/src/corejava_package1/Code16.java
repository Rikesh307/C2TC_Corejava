package corejava_package1;

public class Code16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char x = 'F';
				switch(x) {
				
				
				case 'a':
				case 'A':
				System.out.println("the value of x is a");
				    break;
				case 'b':
				case 'B':
					System.out.println("the value of x is b");
					break;
				case 'c':
				case 'C':
					System.out.println("the calue of x is c");
					break;
			    default:
						System.out.println("the value of x is a,b,c");
					break;
					}
				}
		} */

		String name = "te";
		switch(name.toUpperCase()) {
		case "auditor":
		System.out.println("ritesh");
		   break;
		case "team":
			System.out.println("java full stack");
			break;
		case "editor":
			System.out.println("pratik and aditya");
			 break;
	     default :
	    	 System.out.println("invalid entry");
	    	 break;
		}
	}
	}