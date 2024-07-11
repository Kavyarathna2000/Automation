package Programs;

public class Array_Ride
{
	public static void main(String[] args) 
	{
		int[] arr= {1,3,2,5,4};
		addArray(arr);
		addoddArray(arr);
	}
	static void addArray(int[] a)
	{
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	static void addoddArray(int[] b)
	{
		int sum=0;
		for(int i=0;i<=b.length-1;i++)
		{
			if(b[i]%2==0)
				sum=sum+b[i];
		}
		System.out.println(sum);
	}
}
