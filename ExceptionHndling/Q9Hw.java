package ExceptionHndling;
import java.util.*;
public class Q9Hw {

	public static void main(String[] args) throws Exception
	{
		Q9Hw a=new Q9Hw();
		a.userProfile("pallavi",19, "india");
	}
	Scanner sc= new Scanner(System.in);
	
		public void userProfile(String name,int Age,String Country) throws Exception
		{
			if(Age<18)
			{	
				throw new invalidAgeException("you are minor");
			}
			else if(Country.compareToIgnoreCase("india")!=0)
			{
				throw new invalidCountryException("you are not place");
				
			}
			else 
				System.out.println("congrats you are place");
		}
}
class invalidAgeException extends Exception 
	{	
	public invalidAgeException(String s)
	{
	super(s);
}
}
class invalidCountryException extends Exception
{
public invalidCountryException(String s)
{
	super(s);
}
}