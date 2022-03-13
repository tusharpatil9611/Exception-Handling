package ExceptionHndling;
//	 Write a program to check and display if we can write an empty catch block?

public class Q4hw {

	public static void main(String[] args) 
	{
		try 
		{
			System.out.println(10/0);
		} 
		catch (Exception e)
		{
			
		}
		System.out.println("not print output");
	}

}
