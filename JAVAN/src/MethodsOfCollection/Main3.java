package MethodsOfCollection;

import java.util.ArrayList;

public class Main3 
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(2,'F');
		System.out.println(a);
		
		ArrayList ab=new ArrayList();
		ab.add('A');
		ab.add('B');
		a.addAll(1,ab);
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
		System.out.println(a.get(2));
		
		
	}
}
