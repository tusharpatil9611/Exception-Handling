package ExceptionHndling;

public class ThrowException {

	public static void main(String[] args) throws Exception
	{
		int a=10;
		int b=0;
		if(b==0)
		{
			
			throw new Exception("Exception due to Arithmetic ");
		}
		System.out.println(a/b);
	}
}
