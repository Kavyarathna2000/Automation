package Programs;
class Sample
{
	int a=20;
}
class Demo extends Sample
{
	int b=10;
}
class Test extends Demo
{
	int c=15;
}
public class Main7
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
	}
}
