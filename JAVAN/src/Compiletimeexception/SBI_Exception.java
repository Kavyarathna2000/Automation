package Compiletimeexception;

public class SBI_Exception extends Exception
{
	String msg;
	SBI_Exception(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
