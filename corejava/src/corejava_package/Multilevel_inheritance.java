package corejava_package;
class players {
	void kick() {
		System.out.println("i am messi");
	}
  
}
  class cricket extends players {
	  void practice () {
		  System.out.println("i am ponting");
	 }
	  }
	 class basketball extends cricket{
		 void jump() {
			 System.out.println("i am kobe");
	
  }
	 }

public class Multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			basketball fbl = new basketball();
		    fbl.kick();
		    fbl.practice();
		    fbl.jump();
	}
}
