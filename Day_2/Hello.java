class Hello
{
	int a;
	float b ;
	String name;
	//Default Constructor
	Hello()
	{
		a = 10;
		b = 3.4f;
		name = "Pooja";
	}
	
	//Parameterized Constructor
	Hello(int a, float b , String name)
	{
		this.a = a;
		this.b = b;
		this.name = name;
	}
	
	public static void main(String []s)
	{
		Hello h = new Hello();
		System.out.println("a  : "+h.a+"\nb : "+h.b+"\nName : "+h.name);
		
		Hello h1 = new Hello(50,54.3f,"Priya");
		System.out.println("a  : "+h1.a+"\nb : "+h1.b+"\nName : "+h1.name);
	}
}