package ch18.exam09;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample2 {

	public static void main(String[] args) throws IOException {
		File root = new File("C:/");
		File[] contents = root.listFiles();
		
		for(File file : contents)
		{
			if(file.isDirectory())
			{
				System.out.print("<DIR>");
			}else
			{
				System.out.print("\t");
				System.out.println(file.length());
			}
			System.out.print("\t\t\t");  
			System.out.println(file.getName());
		}
		
}
}
