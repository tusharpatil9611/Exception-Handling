package ExceptionHndling;
// Write a program to display the concept of throw by creating a user defined exception and use try 
//catch to handle the exception.

public class Q8Cw {

	public static void main(String[] args) throws  AgeNotMthch
	{
		int age=16;
		if(age<18)
		{
			throw new AgeNotMthch("Age under 18");
		}
		else
			System.out.println("Done Succefully");
		
	}
}
class	 AgeNotMthch extends RuntimeException
{
	 AgeNotMthch(String msg)	//Create constructor.
	{
		super(msg);
	}
}