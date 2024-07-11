package Encapsulation;

class Telegram
{
	private int phno=767697;
	
	public int get_phno()
	{
		return phno;
	}
	
	public void set_phno(int phno)
	{
		this.phno=phno;
	}
}

public class User3
{
	public static void main(String[] args)
	{
		Telegram t=new Telegram();
		System.out.println(t.get_phno());
		t.set_phno(789203);
		System.out.println(t.get_phno());
		
	}
}
