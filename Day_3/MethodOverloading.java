class Calculator
{
	public void add()
	{
		System.out.println("Welcome User: Add() method");
	}
	
	public void add(int a, int b)
	{
		System.out.println("Welcome User: Add(int,int) method");
	}
	
	public void add(float a, int b)
	{
		System.out.println("Welcome User: Add(float,int) method");
	}
	
	public void add(int a, float b)
	{
		System.out.println("Welcome User: Add(int,float) method");
	}
	
}

class MethodOverloading
{
	
	public static void main(String []ar)
	{
		Calculator cal = new Calculator();
		cal.add();
		cal.add(3.4f,55);
		cal.add(4,23.3f);
		cal.add(12,33);
	}
	
}