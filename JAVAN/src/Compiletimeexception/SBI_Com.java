package Compiletimeexception;

public class SBI_Com 
{
	static void balance() throws SBI_Exception
	{
		int bal=800;
		if(bal>=1000)
			System.out.println("Show Balance");
		else
			throw new SBI_Exception("Maintain_Balance");
	}
	public static void main(String[] args)
	{
		try 
		{
			balance();
		}
		catch(SBI_Exception e)
		{
			System.out.println(e.getmessage());
		}
	}
}
