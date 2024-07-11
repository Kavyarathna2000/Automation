package Programs;

public class Abc1
{
	void send(int no)
	{
		System.out.println(no);
	}
	void send(String photo)
	{
		System.out.println(photo);
	}
	void send(int no,String video)
	{
		System.out.println(no+" "+video);
	}
	void send(String file,int no)
	{
		System.out.println(file+" "+no);
	}
	public static void main(String[] args)
	{
		Abc1 a=new Abc1();
		a.send(76758768);
		a.send("Butterfly");
		a.send(7867786,"Birds");
		a.send("Resume", 968968);
	}
}
