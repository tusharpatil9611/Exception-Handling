package ExceptionHndling;
// Show Example of run time stack mechanism using Arithmetic Exception and handle it using try catch.

public class Q2Cw {

	public static void main(String[] args)
	{
		System.out.println("1");
		m1();
		System.out.println("7");
	}

	private static void m1()
	{
		System.out.println("2");
		m2();
		System.out.println("6");
	}

	private static void m2() 
	{
		System.out.println("3");
		try 
		{
			System.out.println(10/0);
		} 
		catch (Exception e) 
		{
			try 
			{
				System.out.println(20/0);
			}
			catch (Exception e2) 
			{
				System.out.println("4");
			}
			System.out.println("5");
		}
	}

}
