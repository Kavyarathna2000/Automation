package string;

public class Reversesentence 
{
	public static void main(String[] args)
	{
		String s="My Name Is Khan";
		String[] s1=s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
	}
}
