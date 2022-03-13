package ExceptionHndling;

public class NestedTryCatch {

	public static void main(String[] args)
	{
		String s="bmnlkv";
		try
		{
			try
			{
				System.out.println(5/0);
			}
			catch(Exception e)
			{
				System.out.println("not Possible");
			}
			try
			{
				System.out.println(s.charAt(100));
			}
			catch(Exception e)
			{
				System.out.println("String out of bond");
			}
		}
		catch(Exception e)
		{
			System.out.println("Same issue");
		}
		System.out.println("Hi");
	}

}
