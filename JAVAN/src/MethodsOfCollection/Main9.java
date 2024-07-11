package MethodsOfCollection;

import java.util.TreeSet;

public class Main9 
{
	public static void main(String[] args) 
	{
		TreeSet a=new TreeSet();
		a.add("Kavya");
		a.add("Divya");
		System.out.println(a);
		
		TreeSet ab=new TreeSet();
		ab.add('A');
		ab.add('B');
		System.out.println(a);
		System.out.println(a);
		System.out.println(ab);

		System.out.println(a);
		ab.removeAll(ab);
		System.out.println(ab);
		System.out.println(a);
		
		System.out.println(a.size());
		
		
	}
}
