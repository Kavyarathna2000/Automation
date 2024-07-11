package Compiletimeexception;

public class Youtube_Exception extends Exception
{
	String msg;
	Youtube_Exception(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}

