package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Prog3
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C://Javafiles/Demo.txt");
		FileWriter fw=new  FileWriter(f);
		fw.write("Hello World");
		fw.flush();
		System.out.println("Data is Written");
		long len=f.length();
		System.out.println(len);
		
	}
}
