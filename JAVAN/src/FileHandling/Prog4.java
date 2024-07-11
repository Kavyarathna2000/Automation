package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Prog4
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C://Javafiles/Demo.txt");
		FileReader fr=new  FileReader(f);
		char[] arr=new char[(int)f.length()];
		fr.read(arr);
		String s=new String(arr);
		System.out.println(s);
	}
}
