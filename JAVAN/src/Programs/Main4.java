package Programs;
class Flipcart
{
	void order()
	{
		System.out.println("Order Something");
	}
}
class BOOK extends Flipcart
{
	void order()
	{
		System.out.println("Order Book");
	}
}
class Mobile extends Flipcart
{
	void order()
	{
		System.out.println("Order Mobile");
	}
}
class Dress extends Flipcart
{
	void order()
	{
		System.out.println("Order Dress");
	}
}
class RTE4
{
	static void orders(Flipcart f)
	{
		f.order();
	}
}


public class Main4
{
	public static void main(String[] args)
	{
		BOOK b=new BOOK();
		Mobile m=new Mobile();
		Dress d=new Dress();
		RTE4.orders(b);
		RTE4.orders(m);
		RTE4.orders(d);
		
	}
}
