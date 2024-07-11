package Compiletimeexception;

public class Age_Exception extends Exception
{
	String msg;
	Age_Exception(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
