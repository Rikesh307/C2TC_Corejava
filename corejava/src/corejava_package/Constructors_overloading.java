package corejava_package;

class Constructors_overloading {
	 int id;  
	    String name;  
	    int age;  
	    //creating two arg constructor  
	    Constructors_overloading (int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //creating three arg constructor  
	    Constructors_overloading (int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
	    public static void main(String args[]){  
	    	Constructors_overloading  s1 = new Constructors_overloading (111,"ritesh");  
	    	Constructors_overloading  s2 = new Constructors_overloading (222,"pratik",25);  
	    s1.display();  
	    s2.display();  
	   }  
	}  
