package MethodsOfCollection;

import java.util.ArrayList;

public class Main2 
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		
		ArrayList ab=new ArrayList();
		ab.add('A');
		ab.add('B');
		a.addAll(ab);
		a.addAll(1,ab);
		System.out.println(a);
		
	}
}
