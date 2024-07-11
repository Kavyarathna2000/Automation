package Trycatchfinally;

public class Main5
{
	public static void main(String[] args)
	{
		try {
			int a=1/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
		finally
		{
			System.out.println("Page not found refresh the page");
		}
	}
}
