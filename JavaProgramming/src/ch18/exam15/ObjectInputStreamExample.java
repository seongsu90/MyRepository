package ch18.exam15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample { //복원

	public static void main(String[] args) throws IOException, ClassNotFoundException {
			
		FileInputStream fis = new FileInputStream("src/ch18/exam15/data.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Member member2 = (Member) ois.readObject();		
		fis.close();
		ois.close();
		
		System.out.println(member2.getMid());
		System.out.println(member2.getMname());
		System.out.println(member2.getMpassword());
		System.out.println(member2.getMage());
		System.out.println(member2.getNation()); // 사실 복원 데이터가아니고 클래스에 있던 정적값일 뿐이다.
	}

}
