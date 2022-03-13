package ExceptionHndling;
//	 Write a program to generate and handle ArrayIndexOutOfBound Exception using try catch.

public class Q5Hw {

	public static void main(String[] args)
	{
		int []a={1,2,3,4,6};
		try {
			System.out.println(a[6]);
		} catch (Exception e) {
			System.out.println("Done ");
		}
		
	}

}
