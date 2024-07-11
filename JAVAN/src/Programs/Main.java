package Programs;
class Animal
{
	void noise()
	{
		System.out.println("Some noise");
	}
}
class Dog extends Animal
{
	void noise()
	{
		System.out.println("Bow Bow");
	}
}
class Cat extends Animal
{
	void noise()
	{
		System.out.println("Meow Meow");
	}
}
class Snake extends Animal
{
	void noise()
	{
		System.out.println("Buss Buss");
	}
}
class Stmiu
{
	static void ansim(Animal a)
	{
		a.noise();
	}
	
}
public class Main {
	public static void main(String[] args)
	{
		Dog d=new Dog();
		Cat c=new Cat();
		Snake s=new Snake();
		Stmiu.ansim(d);
		Stmiu.ansim(c);
		Stmiu.ansim(s);
	}
	

}
