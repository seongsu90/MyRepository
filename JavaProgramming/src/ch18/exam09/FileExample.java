package ch18.exam09;

import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		File file = new File("C:/Temp/dir1/dir2/dir3");
		if(file.exists())
		{
			if(file.isDirectory()){
				System.out.println("디렉토리가 존재함");
			}else{
				System.out.println("파일이 존재함");
			}
			
		}else{
			System.out.println("존재하지 않음");
		}

		File dir = new File("C:/Temp/dir1/dir2/dir3");
		//dir.mkdir(); // 예외 발생한다. dir3만 생성
		dir.mkdirs();
		dir.delete();
	}

}
