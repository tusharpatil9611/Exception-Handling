package ExceptionHndling;
// Write a program to display an example to check if an unchecked Exception is propagated in calling stack

public class Q3Cw {
	
	void m()
	{
		int data=50/2;							//Exception propagate t0 m1();
		 String s="jhdgciu";
		 System.out.println(s.charAt(20));
		
	}
	void m1()
	{
		m();									//Exception Propagate to p(); 
	}
	void p()
	{
		try 
		{
			m1();									// Exception Handled. 	
		}
		catch (Exception e) 
		{
			System.out.println("Exception Handled");
		}
	}
	public static void main(String[] args) 
	{
		Q3Cw obj=new Q3Cw();
		obj.p();
		System.out.println("Normal Flow.............");
	}

}
