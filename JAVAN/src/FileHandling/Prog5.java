package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Prog5 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C://Javafiles/K.jpg");
		FileInputStream fis=new FileInputStream(f);
		byte[] arr=new byte[(int)f.length()];
		fis.read(arr);
		FileOutputStream fos=new FileOutputStream("C://Javafiles/sample.jpg");
		fos.write(arr);
		fos.flush();
		System.out.println("Data has Copied");
	}
}
