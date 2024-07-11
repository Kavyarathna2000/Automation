package Programs;
class Instagram
{
	void count()
	{
		System.out.println("Count Something");
	}
}
class Followers extends Instagram
{
	void count()
	{
		System.out.println("1M");
	}
}
class Posts extends Instagram
{
	void count()
	{
		System.out.println("50");
	}
}
class Likes extends Instagram
{
	void count()
	{
		System.out.println("1000005");
	}
}
class Comments extends Instagram
{
	void count()
	{
		System.out.println("1080");
	}
}
class RTE2
{
	static void counts(Instagram i)
	{
		i.count();
	}
}


public class Main2
{
	public static void main(String[] args)
	{
		Followers f=new Followers();
		Posts p=new Posts();
		Likes l=new Likes();
		Comments c=new Comments();
		RTE2.counts(f);
		RTE2.counts(p);
		RTE2.counts(l);
		RTE2.counts(c);
		
	}
}
