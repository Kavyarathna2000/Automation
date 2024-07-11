package Encapsulation;

class Instagram
{
	private String dp="1Ab.img";
	
	public String get_dp()
	{
		return dp;
	}
	
	public void set_dp(String dp)
	{
		this.dp=dp;
	}
}

public class User2
{
	public static void main(String[] args)
	{
		Instagram i=new Instagram();
		System.out.println(i.get_dp());
		i.set_dp("abc.img");
		System.out.println(i.get_dp());
		
	}
}
