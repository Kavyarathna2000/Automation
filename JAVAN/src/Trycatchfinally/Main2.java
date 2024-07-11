package Trycatchfinally;

public class Main2
{
	public static void main(String[] args)
	{
		Main2 m=null;
		try
		{
			System.out.println(m.hashCode());
		}
		catch(NullPointerException e)
		{
			System.out.println("Handled");
		}
	}
}
