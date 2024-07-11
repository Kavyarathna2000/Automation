package MethodsOfCollection;

import java.util.HashSet;

public class Main5
{
	public static void main(String[] args) 
	{
		HashSet a=new HashSet();
		a.add(1);
		a.add(2);
		System.out.println(a);
		
		HashSet ab=new HashSet();
		ab.add('A');
		ab.add('B');
		System.out.println(a);
		a.addAll(ab);
		System.out.println(a);
		System.out.println(ab);
		
		a.remove(0);
		System.out.println(a);
		ab.removeAll(ab);
		System.out.println(ab);
		System.out.println(a);
		
		System.out.println(a.size());
		System.out.println(a.contains('A'));
		
		
	}
}
