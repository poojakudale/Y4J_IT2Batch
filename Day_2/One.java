class One
{
	void access() //user defined method
	{
		System.out.println("Good Morning!!");
	}
	
	public static void show()
	{
		System.out.println("In show()");
	}
	
	public static void main(String []s) 
	{
		System.out.println("Main Begins!!");
		//Object creation : Reference = object creation;
		One obj1 = new One();
		obj1.access();	//Method call
		
		Second obj2 = new Second();
		obj2.display();
		Second.check();
		System.out.println(obj2.x);
		show();
		System.out.println("Main Ends!!");
		
	}
}

