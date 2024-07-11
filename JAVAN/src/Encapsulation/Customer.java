package Encapsulation;

class Icici_Bank
{
	private int atm_pin=3214;
	
	public int get_atmpin()
	{
		return atm_pin;
	}
	
	public void set_atmpin(int atm_pin)
	{
		this.atm_pin=atm_pin;
	}
}

public class Customer
{
	public static void main(String[] args)
	{
		Icici_Bank i=new Icici_Bank();
		System.out.println(i.get_atmpin());
		i.set_atmpin(3217);
		System.out.println(i.get_atmpin());
		
	}
}
