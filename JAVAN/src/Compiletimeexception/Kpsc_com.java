package Compiletimeexception;

public class Kpsc_com 
{
	static void apply() throws Age_Exception
	{
		int age=17;
		if(age>=21)
			System.out.println("Apply for Job");
		else
			throw new Age_Exception("InvalidAge");
	}
	public static void main(String[] args)
	{
		try
		{
			apply();
		}
		catch(Age_Exception e)
		{
			System.out.println(e.getmessage());
		}
	}
}
