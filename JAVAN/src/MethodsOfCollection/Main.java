package MethodsOfCollection;

import java.util.ArrayList;
//to import use ctrl+shift+O

public class Main
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add("Hi");
		a.add("bye");
		a.add('D');
		a.add(1,123);
		System.out.println(a);
		a.add(2, "Good");
		System.out.println(a);
	}
}
