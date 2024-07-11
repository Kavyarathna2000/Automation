package MethodsOfCollection;

import java.util.PriorityQueue;
import java.util.Vector;

public class Main7
{
	public static void main(String[] args) 
	{
		Vector a=new Vector();
		a.add("hi");
		a.add("Hello");
		
		System.out.println(a);
		
		Vector ab=new Vector();
		ab.add('A');
		ab.add('B');
		System.out.println(a);
		System.out.println(ab);
		
		//System.out.println(a.peek()); peek is undefined in Vector
		//System.out.println(a.poll());
		
		a.remove(0);
		System.out.println(a);
		ab.removeAll(ab);
		System.out.println(ab);
		System.out.println(a);
		
		System.out.println(a.size());
		System.out.println(a.contains('A'));
		
		
	}
}
