package corejava_package;

public class volume {
	void vol(int side) {
		int area=side*side*side;
	System.out.println("area of the cube="+area);
	}
	 void vol(int l,int b,int h)
	{
	int area=l*b*h;
	System.out.println("area of the cuboid ="+area);
	}
    void vol(double r) {
    	double sph = 4.0/3*3.14*r*r*r;
    	System.out.println("area of sphere="+sph);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		volume ob = new volume();
		ob.vol(4);
		ob.vol(2,4,3);
		ob.vol(2.0);	
	}

}
