package Trycatchfinally;

public class Main4 
{
	public static void main(String[] args)
	{
		try {
			int a=1/0;
			System.out.println(a);
			int[] arr= {1,2,3,4,5};
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("caught");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
	}
}
