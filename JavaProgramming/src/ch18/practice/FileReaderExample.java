package ch18.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		File file = new File("src/ch18/practice/NAVER.html");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		char[] charRead = new char[100];
		int charNum = -1;
		
		int count=0;
		while(true)
		{
			count+=1;
			String data = br.readLine();
			System.out.println(count+": "+data);
			if(data==null)
			{
				break;
			}
		}

	}

}
