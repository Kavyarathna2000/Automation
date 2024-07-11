package Compiletimeexception;

public class Voterid_Exception extends Exception
{
	String msg;
	Voterid_Exception(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
