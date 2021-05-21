class Constructor
{
	
	Constructor()
	{
		System.out.println("In default Constructor()");
	}

	Constructor(int x)
	{
		System.out.println("In parameterized Constructor(int)");
	}

	Constructor(int x, float f)
	{
		System.out.println("In parameterized Constructor(int,float)");
	}
	
	public static void main(String []rs)
	{
		new Constructor();
		new Constructor(23);
		new Constructor(3,4.5f);
	System.out.println("In main()");
	
	}
}