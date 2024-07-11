package FileHandling;

import java.io.File;
import java.io.IOException;

public class Create_folder1
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("C://Javafiles/Demo.txt");
		if(f.createNewFile())
			System.out.println("File is created");
	}
}