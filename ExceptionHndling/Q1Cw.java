package ExceptionHndling;
// Show Example of run time stack mechanism using Arithmetic Exception and handle it using try catch.

public class Q1Cw 
{
	public static void main(String[] args) 
	{
		System.out.println("In Main");
		m1();
		System.out.println("out Main");
	}
	public static void m1()
	{
		System.out.println("In M1");
		m2();
		System.out.println("Out M1");
		//System.out.println((10/2));
	}
	public static void m2() 
	{
		System.out.println("In M2");
		try 
		{
		System.out.println(5/0);	
		} 
		catch (Exception e) 
		{
		System.out.println("Out M2");
		}
	}
}
