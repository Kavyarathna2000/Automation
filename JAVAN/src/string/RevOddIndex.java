package string;

public class RevOddIndex
{
	public static void main(String[] args)
	{
		String s="My Name Is Khan";
		String[] s1=s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--)
		{
			if(i%2==1)
				System.out.print(reverse(s1[i]+" "));
			else
				System.out.print(" "+s1[i]+" ");
		}
	}
	static String reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
}