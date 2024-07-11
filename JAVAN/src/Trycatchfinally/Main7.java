package Trycatchfinally;

public class Main7 
{
	static void disp3()
	{
		int a=1/0;
		System.out.println(a);
	}
	static void disp2()
	{
		disp3();
	}
	static void disp1()
	{
		disp2();
	}
	public static void main(String[] args)
	{
		try
		{
			disp1();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
}
