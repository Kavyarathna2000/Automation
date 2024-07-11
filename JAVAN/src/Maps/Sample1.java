package Maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Sample1
{
	public static void main(String[] args)
	{
		String s="abacbdacndaca";
		LinkedHashMap<Character, Integer> l=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(!l.containsKey(ch))
			{
				l.put(ch,1);
			}
			else
			{
				int value=l.get(ch);
				l.put(ch, value=value+1);
			}
		}
		for(Entry<Character, Integer> o:l.entrySet())
		{
			System.out.println(o.getKey()+"="+o.getValue());
		}
	}
}
