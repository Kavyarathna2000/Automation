package Programs;
class Twitter
{
	void name()
	{
		System.out.println("Twitter");
	}
}
class Twitter1 extends Twitter
{
	void name()
	{
		System.out.println("X");
	}
}
public class Main6 
{
	public static void main(String[] args) 
	{
		Twitter1 t=new Twitter1();
		t.name();
	}
}
