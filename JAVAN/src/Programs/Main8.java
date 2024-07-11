package Programs;
class Sample1
{
	int a=20;
}
class Demo1 extends Sample1
{
	void fo()
	{
		System.out.println("Hi");
	}
}
class Test1 extends Sample1
{
	void cool()
	{
		System.out.println("I am Cool");
	}
}
public class Main8
{
	public static void main(String[] args) 
	{
		Demo1 d=new Demo1();
		System.out.println(d.a);
		d.fo();
		Test1 t=new Test1();
		System.out.println(t.a);
		t.cool();
	}
}
