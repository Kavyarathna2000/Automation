package FileHandling;

import java.io.File;

public class Create_folder2 
{
	public static void main(String[] args)
	{
		File f=new File("C://Javafiles");
		if(f.mkdir())
			System.out.println("Folder is created");
		else
			System.out.println("Folder is not created");
		if(f.exists())	
			System.out.println("Folder is Present");
	}
}
