package ExceptionHndling;

import java.util.Scanner;
		// Write a program to display and explain the use of finally.
public class Q4Cw {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=sc.nextInt();
		try 
		{
			System.out.println(num/0);
		} 
		catch (Exception e) 
		{
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("Hii block is close Succefully");
			sc.close();
		}
	}

}
