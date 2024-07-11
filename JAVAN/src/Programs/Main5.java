package Programs;
class Juice
{
	void buy()
	{
		System.out.println("Order Something");
	}
}
class Mango extends Juice
{
	void buy()
	{
		System.out.println("Mango Juice");
	}
}
class Apple extends Juice
{
	void buy()
	{
		System.out.println("Apple  Juice");
	}
}
class Orange extends Juice
{
	void buy()
	{
		System.out.println("Orange Juice");
	}
}
class RTE5
{
	static void taste(Juice j)
	{
		j.buy();
	}
}


public class Main5
{
	public static void main(String[] args)
	{
		Mango m=new Mango();
		Apple  a=new Apple ();
		Orange o=new Orange();
		RTE5.taste(m);
		RTE5.taste(a);
		RTE5.taste(o);
		
	}
}
