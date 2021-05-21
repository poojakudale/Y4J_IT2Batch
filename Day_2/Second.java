class Second
{
	public static int z; //static variable
	public int x;  // instance variables
	void print()
	{	x = 10;
		int y = 90; // local variable
		System.out.println("In Print() method");
	}
	void display()
	{
		print();
		System.out.println("In display() method ");
	}
	
	static void check()
	{
		float percent = 67.56;
		String name = "Pooja"; // string literal
			z = 13; 
		System.out.println("In Check() method");
	}

}