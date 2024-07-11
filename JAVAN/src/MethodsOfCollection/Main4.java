package MethodsOfCollection;

import java.util.LinkedList;

public class Main4 
{
	public static void main(String[] args) 
	{
		LinkedList a=new LinkedList();
		a.add("Hi");
		a.add("Hello");
		a.add(2,'F');
		
		LinkedList ab=new LinkedList();
		ab.add('I');
		ab.add('H');
		a.addAll(ab);
		a.addAll(1,ab);
		System.out.println(a);
		
		a.remove(1);
		System.out.println(a);
		ab.removeAll(ab);
		System.out.println(ab);
		System.out.println(a);
		
		System.out.println(a.size());
		System.out.println(a.contains("Hello"));
		System.out.println(a.get(2));
		
		
	}
}
