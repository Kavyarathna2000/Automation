package Trycatchfinally;

public class Main6 
{
	public static void main(String[] args)
	{
		try {
			int a=1/0;
			System.out.println(a);
		}
		finally
		{
			System.out.println("Page not found refresh the page");
		}
	}
}
