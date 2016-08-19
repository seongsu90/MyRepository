package ch04.exam02;

public class DoWhileExample {

	public static void main(String[] args) throws Exception{
		int num=0;
		do{
			num = System.in.read();
			if(num !=13 && num!=10)
			System.out.println(num);
		}while(num != 113);

	}

}
