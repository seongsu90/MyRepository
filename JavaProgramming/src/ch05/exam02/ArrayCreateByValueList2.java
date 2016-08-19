package ch05.exam02;

public class ArrayCreateByValueList2 {

	public static void main(String[] args) {
		//how1
		int[] scores={83,90,87}; //배열을 선언과 동시에 값을 넣어야된다. 따로 다시 값을 넣으면 안된다.
		System.out.println(scores[0]); // scores라는 변수가 참조하는 배열로가서 0번째 인덱스값을 읽고 출력하시오.
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		int arrayLength = scores.length; // ()괄호가 없기 때문에 필드라고 한다.
		System.out.println("배열의 길이: " +arrayLength);
		
		for(int i =0; i<scores.length;i++)
		{
			System.out.println(scores[i]);
		}
		
		int sum = 0;
		for(int i =0; i<scores.length;i++)
		{
			sum +=scores[i];
			
		}
		System.out.println("전체 합: "+ sum);
		double avg = 1.0*sum/scores.length;
		// double avg = (double) sum / scores.length;
		System.out.println("평균 값: "+avg);
	}
	
	}
