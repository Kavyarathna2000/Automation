package string;

public class Consonents
{
	public static void main(String[] args)
	{
		String s="Qspiders";
		String s1=s.replaceAll("[aeiouAEIOU]","");
		System.out.println(s1);
	}
}
