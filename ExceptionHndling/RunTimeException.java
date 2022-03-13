package ExceptionHndling;

public class RunTimeException 
{
	public static void main(String[] args) 
	{
		System.out.println("In Main");
		m1();
		System.out.println("Out Main");
	}
	private static void m1() 
	{
		System.out.println("In m1");
		m2();
		System.out.println("Out m1");
	}
	private static void m2() 
	{
		System.out.println("In m2");
		try 
		{
			System.out.println(5/0);
		} catch (Exception e)
		{
			System.out.println("Something Wrong");
		}
	
		System.out.println("Out m2");
	}
}
