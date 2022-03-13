package ExceptionHndling;

public class fibonachi extends Thread
{
	public void run()
	{
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 3; i < 7; i++) 
		{
			int temp=a+b;
			System.out.println(temp);
			a=b;
			b=temp;
			try {
				Thread.sleep(100);
				
			} catch (Exception e)
			{
				// TODO: handle exception
			}
		}

	}
	public static void main(String[] args) 
	{
		fibonachi f=new fibonachi();
		f.start();
	}
}
