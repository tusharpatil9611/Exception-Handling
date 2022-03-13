package ExceptionHndling;

public class FinallyBlock {

public static void main(String[] args) 
{
	try 
		{
			System.out.println(10/0);
		}
     catch (Exception e) 
     	{
    	 	System.out.println(12/0);
     	}
	finally 
		{
		try
			{
				System.out.println(11/0);
			}
		catch (Exception e) 
			{
				System.out.println("hii");
			}
		
		System.out.println("false statement all");
		}
}
}
