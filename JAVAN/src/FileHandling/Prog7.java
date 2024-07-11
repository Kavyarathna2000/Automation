package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Prog7
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C://Javafiles/Demo.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		System.out.println(s);
		String s1=br.readLine();
		System.out.println(s1);
		String s2=br.readLine();
		System.out.println(s2);
	}
}
