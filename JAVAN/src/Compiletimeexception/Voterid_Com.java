package Compiletimeexception;

public class Voterid_Com 
{
	static void apply() throws Voterid_Exception
	{
		int age=17;
		if(age>=18)
			System.out.println("Apply for VoterID");
		else
			throw new Voterid_Exception("InvalidAge");
	}
	public static void main(String[] args)
	{
		try
		{
			apply();
		}
		catch(Voterid_Exception e)
		{
			System.out.println(e.getmessage());
		}
	}
}
