package string;

public class Rev 
{
	public static void main(String[] args) 
	{
		String s="AbCdEf";
		String l="";
		String u="";
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			if(Character.isLowerCase(ch))
				l=l+ch;
			else if(Character.isUpperCase(ch))
				u=u+ch;
		}
		System.out.println(u+l);
	}

}
