package ch18.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamExample {
	
	public static void main (String[] args) throws IOException
	{
		File file = new File("src/ch18/practice/sad.PNG");
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream("src/ch18/practice/sad2.PNG");
		
		byte[] ByteRead = new byte[100];
		int byteNum = 0;
		
		while((byteNum=fis.read(ByteRead))!=-1)
		{
			fos.write(ByteRead, 0, byteNum);
		}
		fos.flush();
		
		fos.close();
		fis.close();
		
	}
}
