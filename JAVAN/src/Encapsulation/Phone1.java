package Encapsulation;

class App
{
	private String app_pin="Doggy";
	
	public String get_apppin()
	{
		return app_pin;
	}
	
	public void set_apppin(String app_pin)
	{
		this.app_pin=app_pin;
	}
}

public class Phone1
{
	public static void main(String[] args)
	{
		App a=new App();
		System.out.println(a.get_apppin());
		a.set_apppin("Dollsy");
		System.out.println(a.get_apppin());
		
	}
}
