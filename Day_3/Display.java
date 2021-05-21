class Display
{
	public static void display()
	{
		System.out.println("In display()");
	}
	
	public int display(int a)
	{
		System.out.println("In display(int)");
		
		return a;
	}
	
	public static void main(String []p)
	{
		display();
		Display dis = new Display();
		dis.display(23);
	}
	
}