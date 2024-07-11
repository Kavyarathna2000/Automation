package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Prog6
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C://Javafiles/Demo.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hello");
		bw.newLine();
		bw.write("Bye");
		bw.newLine();
		bw.write("Hi");
		bw.flush();
		System.out.println("Data is Written");
	}
}
