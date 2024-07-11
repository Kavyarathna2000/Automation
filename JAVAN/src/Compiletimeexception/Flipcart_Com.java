package Compiletimeexception;

public class Flipcart_Com 
{
	static void add() throws Flipcart_Exception
	{
		int item=2;
		if(item==1)
			System.out.println("Add to Cart");
		else
			throw new Flipcart_Exception("InvaliInput");
	}
	public static void main(String[] args)
	{
		try
		{
			add();
		}
		catch(Flipcart_Exception e)
		{
			System.out.println(e.getmessage());
		}
	}
}
