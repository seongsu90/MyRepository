package ch05.exam02;

public class ArrayCreateByValueList1 {

	public static void main(String[] args) {
		//how1
		int[] scores1={83,90,87}; //배열을 선언과 동시에 값을 넣어야된다. 따로 다시 값을 넣으면 안된다.
		
		
		//how2
		int[] scores2;
		scores2 = new int[] {83,90,87};
		
		sum(new int[] {83,90,87}); //메소드 호출 , 매개변수를 넣어줘야된다., 매개변수로 넣을때 new int[] {83,80,87} 을 넣어야된다.
		
	}
	
	public static void sum(int[] arr)
	{
		
	}

}
