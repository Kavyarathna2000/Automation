package string;

import java.util.Arrays;

public class AscArray
{
	public static void main(String[] args)
	{
		int[] arr= {1,8,3,9,5};
		Arrays.sort(arr);
		for (int i = arr.length-1; i>=0 ; i--) 
		{
			System.out.println(arr[i]);
		}
		
	}
}
