package MethodsOfCollection;

import java.util.PriorityQueue;

public class Main6 
{
	public static void main(String[] args) 
	{
		PriorityQueue a=new PriorityQueue();
		a.add("hi");
		a.add("Hello");
		
		System.out.println(a);
		
		PriorityQueue ab=new PriorityQueue();
		ab.add('A');
		ab.add('B');
		System.out.println(a);
		System.out.println(ab);
		
		System.out.println(a.peek());
		System.out.println(a.poll());
		
		a.remove(0);
		System.out.println(a);
		ab.removeAll(ab);
		System.out.println(ab);
		System.out.println(a);
		
		System.out.println(a.size());
		System.out.println(a.contains('A'));
		
		
	}
}
