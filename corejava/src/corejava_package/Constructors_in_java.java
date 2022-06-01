package corejava_package;
class Mymainemployee {
	private int id;
	private String name;
	
public Mymainemployee() {
		id=45;
		name="ritesh";
	}
public String getName() {
	return name;
}
public void setName(String n) {
	this.name=n;	
}
public void setId(int i) {
	this.id=i;
}
public int getId() {
	return id;
}
}
public class Constructors_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mymainemployee harry= new Mymainemployee();
		harry.setName("CodeWithHarrry");
		harry.setId(34);
		System.out.println(harry.getId());
		System.out.println(harry.getName());
	}

}
