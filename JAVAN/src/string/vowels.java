package string;

public class vowels
{
	public static void main(String[] args)
	{
		String s="Qspiders";
		String vowels="";
		for(int i=0;i<=s.length()-1;i++)
		{
			 char ch=s.charAt(i);
			 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				 vowels=vowels+ch;
		}
		System.out.println(vowels);
	}
}
