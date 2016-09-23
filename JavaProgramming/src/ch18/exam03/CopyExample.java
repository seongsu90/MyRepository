package ch18.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample { //copy 프로그램

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("src/ch18/exam03/sad.PNG");
		OutputStream os = new FileOutputStream("src/ch18/exam03/sad2.PNG");
		
		byte[] values = new byte[1024]; //1KB 배열 생성
		int byteNum = -1;
		
		while((byteNum=is.read(values))!=-1)
		{
			os.write(values, 0, byteNum);
		}
		os.flush();
		os.close();
		is.close();

	}

}
