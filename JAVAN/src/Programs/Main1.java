package Programs;
class Movies
{
	void watch()
	{
		System.out.println("Any Movies");
	}
}
class Kannada extends Movies
{
	void watch()
	{
		System.out.println("99");
	}
}
class Telugu extends Movies
{
	void watch()
	{
		System.out.println("Hi Nanna");
	}
}
class Tamil extends Movies
{
	void watch()
	{
		System.out.println("Teri");
	}
}
class Hindi extends Movies
{
	void watch()
	{
		System.out.println("3 Idiots");
	}
}
class Stimulate
{
	static void stim(Movies m)
	{
		m.watch();
	}
}


public class Main1
{
	public static void main(String[] args)
	{
		Kannada k=new Kannada();
		Telugu t=new Telugu();
		Tamil t1=new Tamil();
		Hindi h=new Hindi();
		Stimulate.stim(k);
		Stimulate.stim(t);
		Stimulate.stim(t1);
		Stimulate.stim(h);
		
	}
}
