package corejava_package;
interface play{
	void run();
}
interface dance{
	void run();
}

 class Multiple_inheritance_interface2 implements dance,play {
	public void run()
	{
		System.out.println("im a allrounder....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_inheritance_interface2 obj = new Multiple_inheritance_interface2 ();
		obj.run();
	}

}
