package Programs;
class BookmyShow
{
	void book()
	{
		System.out.println("Count Something");
	}
}
class Shows extends BookmyShow
{
	void book()
	{
		System.out.println("Book Showws");
	}
}
class Drama extends BookmyShow
{
	void book()
	{
		System.out.println("Book Drama");
	}
}
class Movie extends BookmyShow
{
	void book()
	{
		System.out.println("Book Movie");
	}
}
class Concert extends BookmyShow
{
	void book()
	{
		System.out.println("Book Concert");
	}
}
class RTE3
{
	static void books(BookmyShow b)
	{
		b.book();
	}
}


public class Main3
{
	public static void main(String[] args)
	{
		Shows s=new Shows();
		Drama d=new Drama();
		Movie m=new Movie();
		Concert c=new Concert();
		RTE3.books(s);
		RTE3.books(d);
		RTE3.books(m);
		RTE3.books(c);
		
	}
}
