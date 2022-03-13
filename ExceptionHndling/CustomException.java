package ExceptionHndling;

public class CustomException {

	public static void main(String[] args) throws myOwnException 
	{
		int a= 10;
		int b=0;
		if(b==0)
		{
			throw new myOwnException("no is not Divisible by zero");
		}
		System.out.println(a/b);
		
	}
}
class myOwnException extends Exception
{
	myOwnException(String s) 
	{
		super(s);
		
	}

}