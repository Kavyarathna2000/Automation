package MethodsOfCollection;

import java.util.ArrayList;

public class Main1
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(a);
		a.add(0, "Hello");
		System.out.println(a);
		
	}

}
