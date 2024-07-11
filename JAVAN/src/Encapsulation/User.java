package Encapsulation;

class Phone
{
	private int lock_pwd=1221;
	
	public int get_lock_pwd()
	{
		return lock_pwd;
	}
	
	public void set_lock_pwd(int lock_pwd)
	{
		this.lock_pwd=lock_pwd;
	}
}

public class User
{
	public static void main(String[] args)
	{
		Phone p=new Phone();
		System.out.println(p.get_lock_pwd());
		p.set_lock_pwd(1441);
		System.out.println(p.get_lock_pwd());
		
	}
}
