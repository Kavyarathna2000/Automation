package Programs;
class Sample2
{
	int a=20;
}
class Demo2 extends Sample2
{
	int b=10;
}
class Test2 extends Sample2
{
	int c=15;
}
class Abc extends Demo2
{
	void disp()
	{
		System.out.println("Hybrid Level Inheritence");
	}
}
public class Main9
{
	public static void main(String[] args) 
	{
		Test2 t=new Test2();
		System.out.println(t.a);
		System.out.println(t.c);
		Abc a=new Abc();
		System.out.println(a.a);
		System.out.println(a.b);
		
	}
}