package Compiletimeexception;

public class Youtube_Com
{
	static void see() throws Youtube_Exception
	{
		int noofvedios=2;
		if(noofvedios==1)
			System.out.println("See Vedio");
		else
			throw new Youtube_Exception("CannotDisplay");
	}
	public static void main(String[] args)
	{
		try
		{
			see();
		}
		catch(Youtube_Exception e)
		{
			System.out.println(e.getmessage());
		}
	}
}
