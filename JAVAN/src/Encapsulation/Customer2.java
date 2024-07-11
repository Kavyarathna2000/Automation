package Encapsulation;

class Yono
{
	private double bal=1000.02;
	
	public double get_bal()
	{
		return bal;
	}
	
	public void set_bal(double bal)
	{
		this.bal=bal;
	}
}

public class Customer2
{
	public static void main(String[] args)
	{
		Yono y=new Yono();
		System.out.println(y.get_bal());
		y.set_bal(15000.05);
		System.out.println(y.get_bal());
		
	}
}
