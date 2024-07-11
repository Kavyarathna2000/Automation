package Compiletimeexception;

public class Flipcart_Exception extends Exception
{
	String msg;
	Flipcart_Exception(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
