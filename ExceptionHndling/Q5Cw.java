package ExceptionHndling;
import java.io.FileReader;
import java.io.IOException;
		// Display an example of checked exception and simultaneously use multiple catch block.
public class Q5Cw {

	public static void main(String[] args) 
	{
		try
		{
			Thread.sleep(100);
			FileReader file = new FileReader("a.h");
			
		}
		catch(IOException a)
		{
			System.out.println(a);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
