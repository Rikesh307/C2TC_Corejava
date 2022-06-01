package corejava_package;
class Bababa{  
int rollno;  
String name;  
float fee;  
Bababa(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis2{  
public static void main(String args[]){  
Bababa s1=new Bababa(111,"ankit",5000f);  
Bababa s2=new Bababa(112,"shil",6000f);  
s1.display();  
s2.display();  
}}  

