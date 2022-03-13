package ExceptionHndling;

import java.util.Scanner;

public class uiMethod {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two no which cannot contain zero");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("you cant Divide bt zero");
		}
	}

}
